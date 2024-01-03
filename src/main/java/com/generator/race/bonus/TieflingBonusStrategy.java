package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Language;

import java.util.List;
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

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Darkvision",
                "Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You " +
                        "can see in dim light within 60 feet of you as if it were bright light, and in darkness as if " +
                        "it were dim light. You can’t discern color in darkness, only shades of gray."));
        otherBonus.add(new CharacterBonus(
                "Hellish Resistance",
                "You have resistance to fire damage."));
        otherBonus.add(new CharacterBonus(
                "Infernal Legacy",
                "You know the thaumaturgy cantrip. When you reach 3rd level, you can cast the hellish rebuke " +
                        "spell as a 2nd-level spell once with this trait and regain the ability to do so when you " +
                        "finish a long rest. When you reach 5th level, you can cast the darkness spell once with this " +
                        "trait and regain the ability to do so when you finish a long rest. Charisma is your " +
                        "spellcasting ability for these spells."));
        return otherBonus;
    }
}

