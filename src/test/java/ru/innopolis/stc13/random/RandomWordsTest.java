package ru.innopolis.stc13.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomWordsTest {
    RandomWords randomWords = new RandomWords(15);
    String word = randomWords.generateWord(15);

    @Test
    void getWordsArrayTest() {
        String[] array = new String[1000];
        randomWords.getWordsArray(15);
        assertEquals(array.length, 1000);
    }

    @Test
    void generatedWordLengthEquals() {
        assertTrue( word.toString().length() > 0 && word.toString().length() < 16);
    }
}
