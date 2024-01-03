package com.generator;

public enum ArmorProficiency {
    SHIELDS("Shields"),
    LIGHT("Light Armor"),
    MEDIUM("Medium Armor");

    private final String name;

    ArmorProficiency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
