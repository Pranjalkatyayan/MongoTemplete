package com.example.MongoDemo.ServiceLayer;

import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdGenerator {

    @Transient
    private UUID uuid;

    public String getId() {
        this.uuid = UUID.randomUUID();
        return uuid.toString();
    }
}