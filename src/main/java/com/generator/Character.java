package com.generator;

import com.generator.race.Race;

import java.util.*;

public final class Character {
    private final UUID id;
    private String name;
    private int level = 1;
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
        //TODO add other stuff here (full plate, encumbrance, etc.)
    }

    public Set<Language> getLanguages() {
        return new HashSet<>(race.getLanguages());
        //TODO add background/class languages here
    }

    public int getLevel() {
        return level;
    }

    public Set<Skill> getProficiencies() {
        Set<Skill> proficiencies = new HashSet<>();
        proficiencies.addAll(race.getProficiencies());
        //TODO add background/class proficiencies here
        return proficiencies;
    }


    public Set<WeaponProficiency> getWeaponProficiencies() {
        Set<WeaponProficiency> proficiencies = new HashSet<>();
        proficiencies.addAll(race.getWeaponProficiencies());
        //TODO add class proficiencies here
        return proficiencies;
    }

    public Set<ArmorProficiency> getArmorProficiencies() {
        Set<ArmorProficiency> proficiencies = new HashSet<>();
        proficiencies.addAll(race.getArmorProficiencies());
        //TODO add class proficiencies here
        return proficiencies;
    }
}
