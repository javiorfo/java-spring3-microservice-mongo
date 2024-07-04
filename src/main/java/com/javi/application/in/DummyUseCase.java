package com.javi.application.in;

import com.javi.application.in.interfaces.FindAllUseCase;
import com.javi.application.in.interfaces.SaveUseCase;
import com.javi.domain.model.Dummy;

public interface DummyUseCase extends FindAllUseCase<Dummy>, SaveUseCase<Dummy> {
    public Dummy findById(String id);
}
