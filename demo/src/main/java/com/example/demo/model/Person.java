package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

public class Person {

    @Getter @Setter
    private final UUID id;
    @Getter @Setter
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }
}
