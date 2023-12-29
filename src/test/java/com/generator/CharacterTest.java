package com.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
