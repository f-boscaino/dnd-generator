package com.generator.race.bonus;

import com.generator.Language;

import java.util.Set;

public class TieflingBonusStrategy extends BonusStrategy {
    @Override
    public int getCharismaBonus() {
        return 2;
    }

    @Override
    public int getIntelligenceBonus() {
        return 1;
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.INFERNAL);
        return languages;
    }
}

