package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Speed;
import com.generator.WeaponProficiency;

import java.util.List;
import java.util.Set;

public class WoodElfBonusStrategy extends ElfBonusStrategy {

    @Override
    public int getWisdomBonus() {
        return 1;
    }

    public Speed getSpeed() {
        return new Speed(35);
    }

    public Set<WeaponProficiency> getWeaponProficiencies() {
        Set<WeaponProficiency> weapons = super.getWeaponProficiencies();
        weapons.add(WeaponProficiency.LONGSWORD);
        weapons.add(WeaponProficiency.SHORTSWORD);
        weapons.add(WeaponProficiency.LONGBOW);
        weapons.add(WeaponProficiency.SHORTBOW);
        return weapons;
    }

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Mask of the Wild",
                "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, " +
                        "falling snow, mist, and other natural phenomena."));
        return otherBonus;
    }

}
