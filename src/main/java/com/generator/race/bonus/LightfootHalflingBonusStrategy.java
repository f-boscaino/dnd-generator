package com.generator.race.bonus;

import com.generator.CharacterBonus;

import java.util.List;

public class LightfootHalflingBonusStrategy extends DwarfBonusStrategy {
    @Override
    public int getCharismaBonus() {
        return 1;
    }

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Naturally Stealthy",
                "You can attempt to hide even when you are obscured only by a creature that is at least " +
                        "one size larger than you."));
        return otherBonus;
    }
}
