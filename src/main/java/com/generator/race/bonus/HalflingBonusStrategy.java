package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Language;
import com.generator.Size;
import com.generator.Speed;

import java.util.List;
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
        return new Speed(25);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.HALFLING);
        return languages;
    }

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Lucky",
                "When you roll a 1 on the d20 for an attack roll, ability check, or saving throw, you " +
                        "can reroll the die and must use the new roll."));
        otherBonus.add(new CharacterBonus(
                "Brave",
                "You have advantage on saving throws against being frightened."));
        otherBonus.add(new CharacterBonus(
                "Halfling Nimbleness",
                "You can move through the space of any creature that is of a size larger than yours."));
        return otherBonus;
    }
}
