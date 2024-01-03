package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Language;
import com.generator.Size;
import com.generator.Speed;

import java.util.List;
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

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Darkvision",
                "Accustomed to life underground, you have superior vision in dark and dim conditions. " +
                        "You can see in dim light within 60 feet of you as if it were bright light, and in darkness " +
                        "as if it were dim light. You can’t discern color in darkness, only shades of gray."));
        otherBonus.add(new CharacterBonus(
                "Gnome Cunning",
                "You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic."));
        return otherBonus;
    }
}
