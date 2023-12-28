package com.generator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PlayerTest {

    @Test
    public void aPlayerCanCreateACharacter() {
        //Given
        Player player = new Player();

        //When
        Character newCharacter = player.createCharacter();

        //Then
        assertNotNull(newCharacter);
    }

    @Test
    public void aPlayerHasAListOfCharacters() {
        //Given
        Player player = new Player();
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
        Player player = new Player();
        Character newCharacter = player.createCharacter();

        //When
        player.deleteCharacterById(newCharacter.getId());

        //Then
        assertEquals(0, player.getCharacters().size());
    }

    @Test
    public void aPlayerWithMoreCharactersCanDeleteOnlyOneOfThem() {
        //Given
        Player player = new Player();
        Character newCharacter = player.createCharacter();
        player.createCharacter();

        //When
        player.deleteCharacterById(newCharacter.getId());

        //Then
        assertEquals(1, player.getCharacters().size());
    }

}