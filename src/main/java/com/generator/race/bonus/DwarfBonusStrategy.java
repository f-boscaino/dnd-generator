package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Speed;

import java.util.Set;

public class DwarfBonusStrategy extends BonusStrategy {
    @Override
    public int getConstitutionBonus() {
        return 2;
    }

    public Speed getSpeed() {
        return new Speed(20, 10, 10);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.DWARVISH);
        return languages;
    }
}

