package com.generator;

import com.generator.classes.CharacterClass;
import com.generator.race.Race;

import java.util.*;

public final class Character {
    private final UUID id;
    private String name;
    private int level = 1;
    private CharacterSettings settings;
    private Race race;
    private CharacterClass characterClass = CharacterClass.NONE;

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
        Set<Language> languages = new HashSet<>();
        languages.addAll(race.getLanguages());
        languages.addAll(characterClass.getLanguages());
        return languages;
        //TODO add background languages here
    }

    public int getLevel() {
        return level;
    }

    public Set<Skill> getProficiencies() {
        Set<Skill> proficiencies = new HashSet<>();
        proficiencies.addAll(race.getProficiencies());
        proficiencies.addAll(characterClass.getProficiencies());
        //TODO add background proficiencies here
        return proficiencies;
    }


    public Set<WeaponProficiency> getWeaponProficiencies() {
        Set<WeaponProficiency> proficiencies = new HashSet<>();
        proficiencies.addAll(race.getWeaponProficiencies());
        proficiencies.addAll(characterClass.getWeaponProficiencies());
        return proficiencies;
    }

    public Set<ArmorProficiency> getArmorProficiencies() {
        Set<ArmorProficiency> proficiencies = new HashSet<>();
        proficiencies.addAll(race.getArmorProficiencies());
        proficiencies.addAll(characterClass.getArmorProficiencies());
        return proficiencies;
    }

    public List<CharacterBonus> getBonusList() {
        List<CharacterBonus> bonusList = new ArrayList<>();
        bonusList.addAll(race.getBonusList());
        return bonusList;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }
}
