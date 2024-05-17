package com.orfosys.application.in;

import com.orfosys.application.in.interfaces.FindAllUseCase;
import com.orfosys.application.in.interfaces.SaveUseCase;
import com.orfosys.domain.model.Dummy;

public interface DummyUseCase extends FindAllUseCase<Dummy>, SaveUseCase<Dummy> {
    public Dummy findById(String id);
}
