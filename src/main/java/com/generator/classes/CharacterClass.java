package com.generator.classes;


import com.generator.ArmorProficiency;
import com.generator.Language;
import com.generator.Skill;
import com.generator.WeaponProficiency;
import com.generator.classes.bonus.*;

import java.util.Collection;

public enum CharacterClass {
    NONE("", new BonusStrategy()),
    FIGHTER("Fighter", new FighterBonusStrategy());

    private final String name;
    private final BonusStrategy bonusStrategy;

    CharacterClass(String name, BonusStrategy bonusStrategy) {
        this.name = name;
        this.bonusStrategy = bonusStrategy;
    }

    public String getName() {
        return name;
    }

    public BonusStrategy getBonusStrategy() {
        return bonusStrategy;
    }

    public Collection<Language> getLanguages() {
        return bonusStrategy.getLanguages();
    }

    public Collection<Skill> getProficiencies() {
        return bonusStrategy.getProficiencies();
    }

    public Collection<WeaponProficiency> getWeaponProficiencies() {
        return bonusStrategy.getWeaponProficiencies();
    }

    public Collection<ArmorProficiency> getArmorProficiencies() {
        return bonusStrategy.getArmorProficiencies();
    }
}
