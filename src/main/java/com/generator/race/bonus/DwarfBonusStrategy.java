package com.generator.race.bonus;

import com.generator.CharacterBonus;
import com.generator.Language;
import com.generator.Speed;
import com.generator.WeaponProficiency;

import java.util.List;
import java.util.Set;

public class DwarfBonusStrategy extends BonusStrategy {
    @Override
    public int getConstitutionBonus() {
        return 2;
    }

    public Speed getSpeed() {
        return new Speed(20);
    }

    public Set<Language> getLanguages() {
        Set<Language> languages = super.getLanguages();
        languages.add(Language.DWARVISH);
        return languages;
    }

    public Set<WeaponProficiency> getWeaponProficiencies() {
        Set<WeaponProficiency> weapons = super.getWeaponProficiencies();
        weapons.add(WeaponProficiency.BATTLEAXE);
        weapons.add(WeaponProficiency.HANDAXE);
        weapons.add(WeaponProficiency.LIGHT_HAMMER);
        weapons.add(WeaponProficiency.WARHAMMER);
        return weapons;
    }

    @Override
    public List<CharacterBonus> getOtherBonus() {
        List<CharacterBonus> otherBonus = super.getOtherBonus();
        otherBonus.add(new CharacterBonus(
                "Darkvision",
                "Accustomed to life underground, you have superior vision in dark and dim conditions. " +
                        "You can see in dim light within 60 feet of you as if it were bright light, and in darkness " +
                        "as if it were dim light. You can't discern color in darkness, only shades of gray."));
        otherBonus.add(new CharacterBonus(
                "Dwarven Resilience",
                "You have advantage on saving throws against poison, and you have resistance against poison " +
                        "damage."));
        otherBonus.add(new CharacterBonus(
                "Stonecunning",
                "Whenever you make an Intelligence (History) check related to the origin of stonework, you " +
                        "are considered proficient in the History skill and add double your proficiency bonus to the " +
                        "check, instead of your normal proficiency bonus."));
        return otherBonus;
    }
}

