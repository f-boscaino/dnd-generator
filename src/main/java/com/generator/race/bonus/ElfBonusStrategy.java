package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Skill;
import com.generator.WeaponProficiency;

import java.util.Set;

public class ElfBonusStrategy extends BonusStrategy {
    @Override
    public int getDexterityBonus() {
        return 2;
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.ELVISH);
        return languages;
    }

    public Set<Skill> getProficiencies() {
        return Set.of(Skill.PERCEPTION);
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