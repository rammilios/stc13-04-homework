package ru.innopolis.stc13.random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class RandomSentenceTest {
    private RandomWords rw;
    private String[] words;
    private List<String> sentence;
    private RandomSentence randomSentence;
    private String oneSentence;
    private static final int MAX_SIZE = 15;
    private static final int CHANCE = 1;



    @BeforeEach
    void before() {
        rw = new RandomWords(MAX_SIZE);
        words = rw.getWordsArray(1000);
        randomSentence = new RandomSentence(MAX_SIZE, words, CHANCE);
        sentence = randomSentence.generateSentence(MAX_SIZE, words, CHANCE);
        oneSentence = randomSentence.getSentence();
    }

    @Test
    void generateSentenceLength() {
        assertTrue( sentence.size() > 0 && sentence.size() < 16);
    }

}