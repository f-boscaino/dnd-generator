package com.generator.race.bonus;

import com.generator.ArmorProficiency;

import java.util.Set;

public class MountainDwarfBonusStrategy extends DwarfBonusStrategy {
    @Override
    public int getStrengthBonus() {
        return 2;
    }

    public Set<ArmorProficiency> getArmorProficiencies() {
        Set<ArmorProficiency> armors = super.getArmorProficiencies();
        armors.add(ArmorProficiency.LIGHT);
        armors.add(ArmorProficiency.MEDIUM);
        return armors;
    }
}
