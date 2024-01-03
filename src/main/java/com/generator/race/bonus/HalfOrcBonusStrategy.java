package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Skill;

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

}