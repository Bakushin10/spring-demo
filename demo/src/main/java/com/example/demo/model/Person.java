package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

public class Person {

    @Getter @Setter
    private final UUID id;
    @Getter @Setter
    private final String name;

    public Person(UUID id, String name){
        this.id = id;
        this.name = name;
    }
}
