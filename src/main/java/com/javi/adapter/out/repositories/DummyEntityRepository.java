package com.javi.adapter.out.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javi.adapter.out.entities.DummyEntity;

public interface DummyEntityRepository extends MongoRepository<DummyEntity, String> {
}
