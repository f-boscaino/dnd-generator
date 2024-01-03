package com.generator;

public enum WeaponProficiency {
    BATTLEAXE("Battleaxe"),
    HANDAXE("Handaxe"),
    LIGHT_HAMMER("Light Hammer"),
    WARHAMMER("Warhammer"),
    LONGSWORD("Longsword"),
    SHORTSWORD("Shortsword"),
    LONGBOW("Longbow"),
    SHORTBOW("Shortbow"),
    SIMPLE("Simple Weapons"),
    MARTIAL("Martial Weapons");

    private final String name;

    WeaponProficiency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
