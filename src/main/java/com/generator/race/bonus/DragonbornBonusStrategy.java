package com.generator.race.bonus;

import com.generator.Language;

import java.util.Set;

public class DragonbornBonusStrategy extends BonusStrategy {
    @Override
    public int getStrengthBonus() {
        return 2;
    }

    @Override
    public int getCharismaBonus() {
        return 1;
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.DRACONIC);
        return languages;
    }
}

