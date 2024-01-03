package com.generator.race.bonus;

import com.generator.Speed;

public class WoodElfBonusStrategy extends ElfBonusStrategy {

    @Override
    public int getWisdomBonus() {
        return 1;
    }

    public Speed getSpeed() {
        return new Speed(35);
    }

}
