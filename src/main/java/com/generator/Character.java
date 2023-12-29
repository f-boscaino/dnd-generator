package com.generator;

import java.util.UUID;

public final class Character {
    private final UUID id;
    private String name;
    private CharacterSettings settings;
    private Race race;
    private final AbilityScore abilityScore;

    public Character(UUID id) {
        this.id = id;
        int START_ABILITY_SCORE = 10;
        abilityScore = new AbilityScore(
                START_ABILITY_SCORE,
                START_ABILITY_SCORE,
                START_ABILITY_SCORE,
                START_ABILITY_SCORE,
                START_ABILITY_SCORE,
                START_ABILITY_SCORE
        );
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
        return race.addBonusToAbilities(abilityScore);
    }
}
