package com.javi.adapter.out;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import com.javi.adapter.out.mappers.DummyMapper;
import com.javi.domain.model.Dummy;
import com.javi.pagination.Page;

@Testcontainers
@DataMongoTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Import({ DummyPersistenceAdapter.class, DummyMapper.class })
public class DummyPersistenceTest {

    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:latest");

    static {
        mongoDBContainer.start();
    }

    @DynamicPropertySource
    public static void setProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
    }

    @Autowired
    private DummyPersistenceAdapter dummyPersistenceAdapter;

    @TestConfiguration
    @EnableMongoAuditing(auditorAwareRef = "testAuditorAware")
    public static class TestConfig {
        @Bean
        public AuditorAware<String> testAuditorAware() {
            return () -> Optional.ofNullable("TestUser");
        }
    }

    @Test
    @Order(1)
    public void save() {
        var dummy = new Dummy("saved");
        dummy = this.dummyPersistenceAdapter.save(dummy);
        assertEquals(dummy.info(), "saved");
    }

    @Test
    @Order(2)
    public void findAll() {
        var page = new Page(0, 10, "id", "asc");

        var result = dummyPersistenceAdapter.findAll(page);

        assertThat(result.results().size()).isEqualTo(1);
    }
}
