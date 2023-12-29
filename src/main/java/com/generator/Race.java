package com.generator;

public enum Race {
    HUMAN(new HumanBonusStrategy()), DWARF(new DwarfBonusStrategy()), HILL_DWARF(new HillDwarfBonusStrategy()), HALFLING(new HalflingBonusStrategy());

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
    }
}
