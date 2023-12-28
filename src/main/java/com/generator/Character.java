package com.generator;

import java.util.UUID;

public final class Character {
    private final UUID id;

    public Character(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

}
