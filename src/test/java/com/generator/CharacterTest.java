package com.generator;

import com.generator.race.Race;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import static com.generator.Language.*;
import static com.generator.Skill.PERCEPTION;
import static org.junit.jupiter.api.Assertions.*;

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
    public void aHumanCharacterShouldHaveAHumanRace(){
        //Given
        character.setRace(Race.HUMAN);

        //Then
        assertEquals("Human", character.getRace().getName());
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

    @Test
    public void anHumanShouldHaveNoStartingProficiencies() {
        //Given
        character.setRace(Race.HUMAN);

        //When
        Set<Skill> skills = character.getProficiencies();

        //Then
        assertEquals(0, skills.size());
    }
    @Test
    public void anElfShouldBeProficientInPerception() {
        //Given
        character.setRace(Race.ELF);

        //When
        Set<Skill> skills = character.getProficiencies();

        //Then
        assertEquals(1, skills.size());
        assertTrue(skills.contains(PERCEPTION));
    }

    @Test
    public void aDwarfShouldHaveProficiencyWithDwarvenWeapons() {
        //Given
        character.setRace(Race.DWARF);

        //When
        Set<WeaponProficiency> weapons = character.getWeaponProficiencies();

        //Then
        assertEquals(4, weapons.size());
        assertTrue(weapons.contains(WeaponProficiency.BATTLEAXE));
        assertTrue(weapons.contains(WeaponProficiency.HANDAXE));
        assertTrue(weapons.contains(WeaponProficiency.LIGHT_HAMMER));
        assertTrue(weapons.contains(WeaponProficiency.WARHAMMER));
    }

    @Test
    public void anHighElfShouldHaveProficiencyWithElvenWeapons() {
        //Given
        character.setRace(Race.HIGH_ELF);

        //When
        Set<WeaponProficiency> weapons = character.getWeaponProficiencies();

        //Then
        assertEquals(4, weapons.size());
        assertTrue(weapons.contains(WeaponProficiency.LONGSWORD));
        assertTrue(weapons.contains(WeaponProficiency.SHORTSWORD));
        assertTrue(weapons.contains(WeaponProficiency.LONGBOW));
        assertTrue(weapons.contains(WeaponProficiency.SHORTBOW));
    }

    @Test
    public void aMountainDwarfShouldHaveProficiencyWithLightAndMediumArmor() {
        //Given
        character.setRace(Race.MOUNTAIN_DWARF);

        //When
        Set<ArmorProficiency> armors = character.getArmorProficiencies();

        //Then
        assertEquals(2, armors.size());
        assertTrue(armors.contains(ArmorProficiency.LIGHT));
        assertTrue(armors.contains(ArmorProficiency.MEDIUM));
    }

    @Test
    public void aDwarfShouldHaveDarkvision() {
        //Given
        character.setRace(Race.DWARF);

        //When
        List<CharacterBonus> bonus = character.getBonusList();

        //Then
        assertEquals(3, bonus.size());
        List<CharacterBonus> expectedBonus = bonus.stream().filter(el -> el.name().equals("Darkvision")).toList();
        assertEquals(1, expectedBonus.size());
    }

    @Test
    public void aHillDwarfShouldHaveDarkvisionToo() {
        //Given
        character.setRace(Race.HILL_DWARF);

        //When
        List<CharacterBonus> bonus = character.getBonusList();

        //Then
        assertEquals(3, bonus.size());
        List<CharacterBonus> expectedBonus = bonus.stream().filter(el -> el.name().equals("Darkvision")).toList();
        assertEquals(1, expectedBonus.size());
    }

    @Test
    public void aHighElfShouldHaveMoreBonusThanANormalElf() {
        //Given
        character.setRace(Race.ELF);
        Character woodElf = new Character(UUID.randomUUID());
        woodElf.setRace(Race.WOOD_ELF);

        //When
        List<CharacterBonus> elfBonus = character.getBonusList();
        List<CharacterBonus> woodElfBonus = woodElf.getBonusList();

        //Then
        assertEquals(3, elfBonus.size());
        assertEquals(4, woodElfBonus.size());
    }
}
