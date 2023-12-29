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
        newCharacter.setRace(Race.HUMAN);

        assertEquals(11, newCharacter.getAbilityScore().strength());
        assertEquals(11, newCharacter.getAbilityScore().dexterity());
        assertEquals(11, newCharacter.getAbilityScore().constitution());
        assertEquals(11, newCharacter.getAbilityScore().intelligence());
        assertEquals(11, newCharacter.getAbilityScore().wisdom());
        assertEquals(11, newCharacter.getAbilityScore().charisma());
    }

    @Test
    public void aDwarfCharacterShouldHaveJustTheConstitutionBonus() {
        newCharacter.setRace(Race.DWARF);

        assertEquals(10, newCharacter.getAbilityScore().strength());
        assertEquals(10, newCharacter.getAbilityScore().dexterity());
        assertEquals(12, newCharacter.getAbilityScore().constitution());
        assertEquals(10, newCharacter.getAbilityScore().intelligence());
        assertEquals(10, newCharacter.getAbilityScore().wisdom());
        assertEquals(10, newCharacter.getAbilityScore().charisma());
    }
}
