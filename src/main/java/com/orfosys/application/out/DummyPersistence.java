package com.orfosys.application.out;

import java.util.Optional;

import com.orfosys.application.out.interfaces.FindAllPersistence;
import com.orfosys.application.out.interfaces.SavePersistence;
import com.orfosys.domain.model.Dummy;

public interface DummyPersistence extends FindAllPersistence<Dummy>, SavePersistence<Dummy> {
    public Optional<Dummy> findById(String id);
}
