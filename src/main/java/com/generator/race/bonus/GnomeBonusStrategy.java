package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Size;
import com.generator.Speed;

import java.util.Set;

public class GnomeBonusStrategy extends BonusStrategy {
    @Override
    public int getIntelligenceBonus() {
        return 2;
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public Speed getSpeed() {
        return new Speed(25);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.GNOMISH);
        return languages;
    }
}
