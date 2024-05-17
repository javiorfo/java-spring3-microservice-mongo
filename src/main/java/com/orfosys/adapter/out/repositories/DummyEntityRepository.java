package com.orfosys.adapter.out.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orfosys.adapter.out.entities.DummyEntity;

public interface DummyEntityRepository extends MongoRepository<DummyEntity, String> {
}
