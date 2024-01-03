package com.generator.race.bonus;

import com.generator.CharacterBonus;

import java.util.List;

public class StoutHalflingBonusStrategy extends DwarfBonusStrategy {
    @Override
    public int getConstitutionBonus() {
        return 1;
    }

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Stout Resilience",
                "You have advantage on saving throws against poison, and you have resistance against " +
                        "poison damage."));
        return otherBonus;
    }
}
