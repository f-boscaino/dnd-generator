package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Language;
import com.generator.Skill;

import java.util.List;
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


    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Darkvision",
                "Accustomed to twilit forests and the night sky, you have superior vision in dark and dim " +
                        "conditions. You can see in dim light within 60 feet of you as if it were bright light, and in " +
                        "darkness as if it were dim light. You can't discern color in darkness, only shades of gray."));
        otherBonus.add(new CharacterBonus(
                "Fey Ancestry",
                "You have advantage on saving throws against being charmed, and magic can't put you to sleep."));
        otherBonus.add(new CharacterBonus(
                "Trance",
                "Elves do not sleep. Instead they meditate deeply, remaining semi-conscious, for 4 hours a " +
                        "day. The Common word for this meditation is \"trance.\" While meditating, you dream after a " +
                        "fashion; such dreams are actually mental exercises that have become reflexive after years of " +
                        "practice. After resting in this way, you gain the same benefit a human would from 8 hours of " +
                        "sleep."));
        return otherBonus;
    }
}