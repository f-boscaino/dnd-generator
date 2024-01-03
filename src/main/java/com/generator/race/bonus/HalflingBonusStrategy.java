package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Size;
import com.generator.Speed;

import java.util.Set;

public class HalflingBonusStrategy extends BonusStrategy {
    @Override
    public int getDexterityBonus() {
        return 2;
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public Speed getSpeed() {
        return new Speed(25, 12, 12);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.HALFLING);
        return languages;
    }
}
