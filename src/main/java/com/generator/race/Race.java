package com.generator.race;

import com.generator.*;
import com.generator.race.bonus.*;

import java.util.Collection;
import java.util.Set;

public enum Race {
    HUMAN(new HumanBonusStrategy(), "Human"),

    DWARF(new DwarfBonusStrategy(), "Dwarf"),
    MOUNTAIN_DWARF(new MountainDwarfBonusStrategy(), "Mountain Dwarf"),
    HILL_DWARF(new HillDwarfBonusStrategy(), "Hill Dwarf"),

    HALFLING(new HalflingBonusStrategy(), "Halfling"),
    LIGHTFOOT_HALFLING(new LightfootHalflingBonusStrategy(), "Lightfoot Halfling"),
    STOUT_HALFLING(new StoutHalflingBonusStrategy(), "Stout Halfling"),

    GNOME(new GnomeBonusStrategy(), "Gnome"),
    FOREST_GNOME(new ForestGnomeBonusStrategy(), "Forest Gnome"),
    ROCK_GNOME(new RockGnomeBonusStrategy(), "Rock Gnome"),

    DRAGONBORN(new DragonbornBonusStrategy(), "Dragonborn"),
    HALF_ORC(new HalfOrcBonusStrategy(), "HalfOrc"),
    TIEFLING(new TieflingBonusStrategy(), "Tiefling"),

    ELF(new ElfBonusStrategy(), "Elf"),
    HIGH_ELF(new HighElfBonusStrategy(), "High Elf"),
    WOOD_ELF(new WoodElfBonusStrategy(), "Wood Elf");

    private final BonusStrategy bonusStrategy;

    private final String name;

    Race(BonusStrategy bonusStrategy, String name) {
        this.bonusStrategy = bonusStrategy;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public Set<Skill> getProficiencies() {
        return bonusStrategy.getProficiencies();
    }

    public Collection<WeaponProficiency> getWeaponProficiencies() {
        return bonusStrategy.getWeaponProficiencies();
    }

    public Collection<ArmorProficiency> getArmorProficiencies() {
        return bonusStrategy.getArmorProficiencies();
    }

    public Collection<CharacterBonus> getBonusList() {
        return bonusStrategy.getOtherBonus();
    }
}
