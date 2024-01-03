package com.generator.race.bonus;

import com.generator.Language;
import com.generator.Skill;

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

}