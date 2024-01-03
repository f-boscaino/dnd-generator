package com.generator.race;

import com.generator.*;
import com.generator.race.bonus.*;

import java.util.Collection;
import java.util.Set;

public enum Race {
    HUMAN(new HumanBonusStrategy(), "Human"),
    DWARF(new DwarfBonusStrategy(), "Dwarf"),
    HILL_DWARF(new HillDwarfBonusStrategy(), "Hill Dwarf"),
    HALFLING(new HalflingBonusStrategy(), "Halfling"),
    ELF(new ElfBonusStrategy(), "Elf");

    private final BonusStrategy bonusStrategy;

    private final String name;

    Race(BonusStrategy bonusStrategy, String name) {
        this.bonusStrategy = bonusStrategy;
        this.name = name;
    }

    public AbilityScore addBonusToAbilities(AbilityScore start) {
        return bonusStrategy.addBonus(start);
    }

    public Size getSize() {
        return bonusStrategy.getSize();
    }

    public Speed getSpeed() {
        return bonusStrategy.getSpeed();
    }

    public Set<Language> getLanguages() {
        return bonusStrategy.getLanguages();
    }

    public String getName() {
        return name;
    }

    public Set<Skill> getProficiencies() {
        return bonusStrategy.getProficiencies();
    }

    public Collection<WeaponProficiency> getWeaponProficiencies() {
        return bonusStrategy.getWeaponProficiencies();
    }
}
