package com.generator;

public record AbilityScore(
        int strength,
        int dexterity,
        int constitution,
        int intelligence,
        int wisdom,
        int charisma
) {

    AbilityScore() {
        this(10, 10, 10, 10, 10, 10);
    }
}
