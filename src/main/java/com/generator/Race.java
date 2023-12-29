package com.generator;

import java.util.HashSet;
import java.util.Set;

public enum Race {
    HUMAN(new HumanBonusStrategy()), DWARF(new DwarfBonusStrategy()), HILL_DWARF(new HillDwarfBonusStrategy()), HALFLING(new HalflingBonusStrategy()), ELF(new ElfBonusStrategy());

    private final BonusStrategy bonusStrategy;

    Race(BonusStrategy bonusStrategy) {
        this.bonusStrategy = bonusStrategy;
    }

    public AbilityScore addBonusToAbilities(AbilityScore start) {
        return bonusStrategy.addBonus(start);
    }

    public Size getSize() {
        return bonusStrategy.getSize();
    }

    public Speed getSpeed() {
        return bonusStrategy.getSpeed();
    }

    public Set<Language> getLanguages() {
        return bonusStrategy.getLanguages();
    }

    private static class BonusStrategy {

        public int getStrengthBonus() {
            return 0;
        }

        public int getDexterityBonus() {
            return 0;
        }

        public int getConstitutionBonus() {
            return 0;
        }

        public int getIntelligenceBonus() {
            return 0;
        }

        public int getWisdomBonus() {
            return 0;
        }

        public int getCharismaBonus() {
            return 0;
        }

        public AbilityScore addBonus(AbilityScore start) {
            return new AbilityScore(
                    start.strength() + getStrengthBonus(),
                    start.dexterity() + getDexterityBonus(),
                    start.constitution() + getConstitutionBonus(),
                    start.intelligence() + getIntelligenceBonus(),
                    start.wisdom() + getWisdomBonus(),
                    start.charisma() + getCharismaBonus()
            );

        }

        public Size getSize() {
            return Size.MEDIUM;
        }

        public Speed getSpeed() {
            return new Speed(30, 15, 15);
        }

        public Set<Language> getLanguages() {
            Set<Language> languages = new HashSet<>();
            languages.add(Language.COMMON);
            return languages;
        }
    }

    private static class HumanBonusStrategy extends BonusStrategy {
        @Override
        public int getStrengthBonus() {
            return 1;
        }

        @Override
        public int getDexterityBonus() {
            return 1;
        }

        @Override
        public int getConstitutionBonus() {
            return 1;
        }

        @Override
        public int getIntelligenceBonus() {
            return 1;
        }

        @Override
        public int getWisdomBonus() {
            return 1;
        }

        @Override
        public int getCharismaBonus() {
            return 1;
        }



    }

    private static class DwarfBonusStrategy extends BonusStrategy {
        @Override
        public int getConstitutionBonus() {
            return 2;
        }

        public Speed getSpeed() {
            return new Speed(20, 10, 10);
        }

        public Set<Language> getLanguages() {
            Set<Language> languages = super.getLanguages();
            languages.add(Language.DWARVISH);
            return languages;
        }
    }

    private static class HillDwarfBonusStrategy extends DwarfBonusStrategy {
        @Override
        public int getWisdomBonus() {
            return 1;
        }
    }

    private static class HalflingBonusStrategy extends BonusStrategy {
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

    private static class ElfBonusStrategy extends BonusStrategy {
        @Override
        public int getDexterityBonus() {
            return 2;
        }

        public Set<Language> getLanguages() {
            Set<Language> languages = super.getLanguages();
            languages.add(Language.ELVISH);
            return languages;
        }

    }
}
