package com.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.UUID;

import static com.generator.Language.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterTest {
    private Character character;

    @BeforeEach
    public void setUp() {
        character = new Character(UUID.randomUUID());
    }

    @Test
    public void aNewCharacterShouldBeLevel1() {
        //Then
        assertEquals(1, character.getLevel());
    }

    @Test
    public void aHumanCharacterShouldHaveAllStatsPlusOne() {
        //Given
        character.setRace(Race.HUMAN);

        //When
        AbilityScore abilityScore = character.getAbilityScore();

        //Then
        assertEquals(11, abilityScore.strength());
        assertEquals(11, abilityScore.dexterity());
        assertEquals(11, abilityScore.constitution());
        assertEquals(11, abilityScore.intelligence());
        assertEquals(11, abilityScore.wisdom());
        assertEquals(11, abilityScore.charisma());
    }

    @Test
    public void aDwarfCharacterShouldHaveJustTheConstitutionBonus() {
        //Given
        character.setRace(Race.DWARF);

        //When
        AbilityScore abilityScore = character.getAbilityScore();

        //Then
        assertEquals(10, abilityScore.strength());
        assertEquals(10, abilityScore.dexterity());
        assertEquals(12, abilityScore.constitution());
        assertEquals(10, abilityScore.intelligence());
        assertEquals(10, abilityScore.wisdom());
        assertEquals(10, abilityScore.charisma());
    }
    @Test
    public void aHillDwarfCharacterShouldHaveConstitutionAndWisdomBonus() {
        //Given
        character.setRace(Race.HILL_DWARF);

        //When
        AbilityScore abilityScore = character.getAbilityScore();

        //Then
        assertEquals(10, abilityScore.strength());
        assertEquals(10, abilityScore.dexterity());
        assertEquals(12, abilityScore.constitution());
        assertEquals(10, abilityScore.intelligence());
        assertEquals(11, abilityScore.wisdom());
        assertEquals(10, abilityScore.charisma());
    }

    @Test
    public void aHumanShouldBeMediumSize() {
        //Given
        character.setRace(Race.HUMAN);

        //When
        Size size = character.getSize();

        //Then
        assertEquals(Size.MEDIUM, size);
    }

    @Test
    public void anHalflingShouldBeSmallSize() {
        //Given
        character.setRace(Race.HALFLING);

        //When
        Size size = character.getSize();

        //Then
        assertEquals(Size.SMALL, size);
    }

    @Test
    public void aHumanShouldHave30ftWalkSpeed() {
        //Given
        character.setRace(Race.HUMAN);

        //When
        Speed speed = character.getSpeed();

        //Then
        assertEquals(30, speed.walk());
    }

    @Test
    public void aDwarfShouldHave20ftWalkSpeed() {
        //Given
        character.setRace(Race.DWARF);

        //When
        Speed speed = character.getSpeed();

        //Then
        assertEquals(20, speed.walk());
    }

    @Test
    public void anElfKnowsCommonAndElvishLanguage() {
        //Given
        character.setRace(Race.ELF);

        //When
        Set<Language> languages = character.getLanguages();

        //Then
        assertEquals(2, languages.size());
        assertTrue(languages.contains(COMMON));
        assertTrue(languages.contains(ELVISH));
    }

    @Test
    public void aDwarfKnowsCommonAndDwarvishLanguage() {
        //Given
        character.setRace(Race.DWARF);

        //When
        Set<Language> languages = character.getLanguages();

        //Then
        assertEquals(2, languages.size());
        assertTrue(languages.contains(COMMON));
        assertTrue(languages.contains(DWARVISH));
    }


}
