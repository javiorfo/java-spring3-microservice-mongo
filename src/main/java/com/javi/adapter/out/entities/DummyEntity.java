package com.javi.adapter.out.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.javi.auditory.model.MongoAuditable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Document(collection = "dummies")
public class DummyEntity  extends MongoAuditable {

    @Id
    private String id;

    private String info;

    public DummyEntity(String info) {
        this.info = info;
    }
}
