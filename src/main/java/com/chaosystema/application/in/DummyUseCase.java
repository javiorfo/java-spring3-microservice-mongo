package com.chaosystema.application.in;

import com.chaosystema.application.in.interfaces.FindAllUseCase;
import com.chaosystema.application.in.interfaces.SaveUseCase;
import com.chaosystema.domain.model.Dummy;

public interface DummyUseCase extends FindAllUseCase<Dummy>, SaveUseCase<Dummy> {
    public Dummy findById(String id);
}
