package com.generator.classes.bonus;

import com.generator.*;

import java.util.HashSet;
import java.util.Set;

public class BonusStrategy {
    public int getHitDice() {
        return 0;
    }

    public Set<WeaponProficiency> getWeaponProficiencies() {
        return new HashSet<>();
    }

    public Set<ArmorProficiency> getArmorProficiencies() {
        return new HashSet<>();
    }

    public Set<Ability> getSavingThrow() {
        return new HashSet<>();
    }

    public Set<Language> getLanguages(){
        return new HashSet<>();
    }

    public Set<Skill> getProficiencies() {
        return new HashSet<>();
    }
}
