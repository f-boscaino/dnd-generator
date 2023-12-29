package com.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.UUID;

import static com.generator.Language.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterTest {
    private Character newCharacter;

    @BeforeEach
    public void setUp() {
        newCharacter = new Character(UUID.randomUUID());
    }

    @Test
    public void aHumanCharacterShouldHaveAllStatsPlusOne() {
        //Given
        newCharacter.setRace(Race.HUMAN);

        //When
        AbilityScore abilityScore = newCharacter.getAbilityScore();

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
        newCharacter.setRace(Race.DWARF);

        //When
        AbilityScore abilityScore = newCharacter.getAbilityScore();

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
        newCharacter.setRace(Race.HILL_DWARF);

        //When
        AbilityScore abilityScore = newCharacter.getAbilityScore();

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
        newCharacter.setRace(Race.HUMAN);

        //When
        Size size = newCharacter.getSize();

        //Then
        assertEquals(Size.MEDIUM, size);
    }

    @Test
    public void anHalflingShouldBeSmallSize() {
        //Given
        newCharacter.setRace(Race.HALFLING);

        //When
        Size size = newCharacter.getSize();

        //Then
        assertEquals(Size.SMALL, size);
    }

    @Test
    public void aHumanShouldHave30ftWalkSpeed() {
        //Given
        newCharacter.setRace(Race.HUMAN);

        //When
        Speed speed = newCharacter.getSpeed();

        //Then
        assertEquals(30, speed.walk());
    }

    @Test
    public void aDwarfShouldHave20ftWalkSpeed() {
        //Given
        newCharacter.setRace(Race.DWARF);

        //When
        Speed speed = newCharacter.getSpeed();

        //Then
        assertEquals(20, speed.walk());
    }

    @Test
    public void anElfKnowsCommonAndElvishLanguage() {
        //Given
        newCharacter.setRace(Race.ELF);

        //When
        Set<Language> languages = newCharacter.getLanguages();

        //Then
        assertEquals(2, languages.size());
        assertTrue(languages.contains(COMMON));
        assertTrue(languages.contains(ELVISH));
    }

    @Test
    public void aDwarfKnowsCommonAndDwarvishLanguage() {
        //Given
        newCharacter.setRace(Race.DWARF);

        //When
        Set<Language> languages = newCharacter.getLanguages();

        //Then
        assertEquals(2, languages.size());
        assertTrue(languages.contains(COMMON));
        assertTrue(languages.contains(DWARVISH));
    }


}
