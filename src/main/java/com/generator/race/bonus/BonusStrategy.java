package com.generator.race.bonus;

import com.generator.*;

import java.util.HashSet;
import java.util.Set;

public class BonusStrategy {

    public int getStrengthBonus() {
        return 0;
    }

    public int getDexterityBonus() {
        return 0;
    }

    public int getConstitutionBonus() {
        return 0;
    }

    public int getIntelligenceBonus() {
        return 0;
    }

    public int getWisdomBonus() {
        return 0;
    }

    public int getCharismaBonus() {
        return 0;
    }

    public AbilityScore addBonus(AbilityScore start) {
        return new AbilityScore(
                start.strength() + getStrengthBonus(),
                start.dexterity() + getDexterityBonus(),
                start.constitution() + getConstitutionBonus(),
                start.intelligence() + getIntelligenceBonus(),
                start.wisdom() + getWisdomBonus(),
                start.charisma() + getCharismaBonus()
        );

    }

    public Size getSize() {
        return Size.MEDIUM;
    }

    public Speed getSpeed() {
        return new Speed(30);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = new HashSet<>();
        languages.add(Language.COMMON);
        return languages;
    }

    public Set<Skill> getProficiencies() {
        return new HashSet<>();
    }

    public Set<WeaponProficiency> getWeaponProficiencies() {
        return new HashSet<>();
    }
}
