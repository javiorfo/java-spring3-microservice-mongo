package com.javi.application.out;

import java.util.Optional;

import com.javi.application.out.interfaces.FindAllPersistence;
import com.javi.application.out.interfaces.SavePersistence;
import com.javi.domain.model.Dummy;

public interface DummyPersistence extends FindAllPersistence<Dummy>, SavePersistence<Dummy> {
    public Optional<Dummy> findById(String id);
}
