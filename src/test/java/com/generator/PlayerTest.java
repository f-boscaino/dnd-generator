package com.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    @Test
    public void aPlayerCanCreateACharacter() {
        //When
        Character newCharacter = player.createCharacter();

        //Then
        assertNotNull(newCharacter);
    }

    @Test
    public void aPlayerHasAListOfCharacters() {
        //Given
        Character newCharacter = player.createCharacter();

        //When
        List<Character> characterList = player.getCharacters();

        //Then
        assertNotNull(characterList);
        assertEquals(1, characterList.size());
        assertEquals(newCharacter, characterList.get(0));
    }

    @Test
    public void aPlayerCanDeleteACharacter() {
        //Given
        Character newCharacter = player.createCharacter();

        //When
        player.deleteCharacterById(newCharacter.getId());

        //Then
        assertEquals(0, player.getCharacters().size());
    }

    @Test
    public void aPlayerWithMoreCharactersCanDeleteOnlyOneOfThem() {
        //Given
        Character newCharacter = player.createCharacter();
        player.createCharacter();

        //When
        player.deleteCharacterById(newCharacter.getId());

        //Then
        assertEquals(1, player.getCharacters().size());
    }

}