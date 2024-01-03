package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Language;
import com.generator.Skill;

import java.util.List;
import java.util.Set;

public class HalfOrcBonusStrategy extends BonusStrategy {
    @Override
    public int getStrengthBonus() {
        return 2;
    }

    @Override
    public int getConstitutionBonus() {
        return 1;
    }
    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.ORC);
        return languages;
    }

    public Set<Skill> getProficiencies() {
        return Set.of(Skill.INTIMIDATION);
    }

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Darkvision",
                "Thanks to your orc blood, you have superior vision in dark and dim conditions. You can " +
                        "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it " +
                        "were dim light. You can’t discern color in darkness, only shades of gray."));
        otherBonus.add(new CharacterBonus(
                "Relentless Endurance",
                "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point " +
                        "instead. You can’t use this feature again until you finish a long rest."));
        otherBonus.add(new CharacterBonus(
                "Savage Attacks",
                "When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s " +
                        "damage dice one additional time and add it to the extra damage of the critical hit."));
        return otherBonus;
    }

}