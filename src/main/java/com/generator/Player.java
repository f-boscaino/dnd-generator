package com.generator;

import java.util.*;

public class Player {

    Map<UUID, Character> characters = new HashMap<>();
    public Character createCharacter() {
        Character character = new Character(UUID.randomUUID());
        characters.put(character.getId(), character);
        return character;
    }

    public List<Character> getCharacters() {
        return characters.values().stream().toList();
    }

    public void deleteCharacterById(UUID id) {
        characters.remove(id);
    }
}
