package com.generator.classes.bonus;

import com.generator.Ability;
import com.generator.ArmorProficiency;
import com.generator.WeaponProficiency;

import java.util.Set;

public class FighterBonusStrategy extends BonusStrategy{
    @Override
    public int getHitDice() {
        return 10;
    }

    @Override
    public Set<WeaponProficiency> getWeaponProficiencies() {
        return Set.of(WeaponProficiency.MARTIAL, WeaponProficiency.SIMPLE);
    }

    @Override
    public Set<ArmorProficiency> getArmorProficiencies() {
        return Set.of(ArmorProficiency.LIGHT, ArmorProficiency.MEDIUM, ArmorProficiency.HEAVY, ArmorProficiency.SHIELDS);
    }

    @Override
    public Set<Ability> getSavingThrow() {
        return Set.of(Ability.STRENGTH, Ability.CONSTITUTION);
    }

    //TODO skill to choose at creation
    //TODO class bonus (lv/title/description) -> multiple choices
}
