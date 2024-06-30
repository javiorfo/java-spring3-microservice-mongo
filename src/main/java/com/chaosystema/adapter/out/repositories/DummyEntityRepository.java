package com.chaosystema.adapter.out.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chaosystema.adapter.out.entities.DummyEntity;

public interface DummyEntityRepository extends MongoRepository<DummyEntity, String> {
}
