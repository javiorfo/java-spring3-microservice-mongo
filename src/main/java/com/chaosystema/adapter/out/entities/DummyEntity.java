package com.chaosystema.adapter.out.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.chaosystema.adapter.out.auditory.Auditable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Document(collection = "dummies")
public class DummyEntity  extends Auditable {

    @Id
    private String id;

    private String info;

    public DummyEntity(String info) {
        this.info = info;
    }
}
