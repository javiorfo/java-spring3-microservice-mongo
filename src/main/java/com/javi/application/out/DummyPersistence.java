package com.javi.application.out;

import java.util.Optional;

import com.javi.domain.model.Dummy;

public interface DummyPersistence extends FindAllPersistence<Dummy>, SavePersistence<Dummy> {
    public Optional<Dummy> findById(String id);
}
