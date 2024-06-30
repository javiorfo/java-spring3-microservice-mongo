package com.chaosystema.application.out;

import java.util.Optional;

import com.chaosystema.application.out.interfaces.FindAllPersistence;
import com.chaosystema.application.out.interfaces.SavePersistence;
import com.chaosystema.domain.model.Dummy;

public interface DummyPersistence extends FindAllPersistence<Dummy>, SavePersistence<Dummy> {
    public Optional<Dummy> findById(String id);
}
