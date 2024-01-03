package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Speed;
import com.generator.WeaponProficiency;

import java.util.Set;

public class DwarfBonusStrategy extends BonusStrategy {
    @Override
    public int getConstitutionBonus() {
        return 2;
    }

    public Speed getSpeed() {
        return new Speed(20);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.DWARVISH);
        return languages;
    }

    public Set<WeaponProficiency> getWeaponProficiencies() {
        Set<WeaponProficiency> weapons = super.getWeaponProficiencies();
        weapons.add(WeaponProficiency.BATTLEAXE);
        weapons.add(WeaponProficiency.HANDAXE);
        weapons.add(WeaponProficiency.LIGHT_HAMMER);
        weapons.add(WeaponProficiency.WARHAMMER);
        return weapons;
    }
}

