package com.generator;

import java.util.UUID;

public final class Character {
    private final UUID id;
    private String name;
    private CharacterSettings settings;
    private Race race;

    public Character(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterSettings getSettings() {
        return settings;
    }

    public void setSettings(CharacterSettings settings) {
        this.settings = settings;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public AbilityScore getAbilityScore() {
        AbilityScore abilityScore = new AbilityScore();
        return race.addBonusToAbilities(abilityScore);
    }

    public Size getSize() {
        return race.getSize();
    }

    public Speed getSpeed() {
        return race.getSpeed();
        //TODO add other stuff here (full plate, encumberance, etc.)
    }
}
