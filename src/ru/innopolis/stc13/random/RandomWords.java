package ru.innopolis.stc13.random;

import java.util.Random;

public class RandomWords {

    private String word = "";

    public String getWord() {
        return word;
    }

    public RandomWords(int maxSize) {

        Random random = new Random();
        int length = random.nextInt(maxSize-1);
        length = length + 1;
        for (int i = 0; i < length; i++) {
            char letter = (char) ((char) random.nextInt(25) + 97);
            word += letter;
        }

    }
}

