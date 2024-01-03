package com.generator.race.bonus;

import com.generator.WeaponProficiency;

import java.util.Set;

public class HighElfBonusStrategy extends ElfBonusStrategy {

    @Override
    public int getIntelligenceBonus() {
        return 1;
    }
    public Set<WeaponProficiency> getWeaponProficiencies() {
        Set<WeaponProficiency> weapons = super.getWeaponProficiencies();
        weapons.add(WeaponProficiency.LONGSWORD);
        weapons.add(WeaponProficiency.SHORTSWORD);
        weapons.add(WeaponProficiency.LONGBOW);
        weapons.add(WeaponProficiency.SHORTBOW);
        return weapons;
    }
}
