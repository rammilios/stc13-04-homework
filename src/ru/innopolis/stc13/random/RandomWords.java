package ru.innopolis.stc13.random;

import java.util.Random;

public class RandomWords {

    private String word = "";

    public RandomWords(int maxSize) {
        String word = generateWord(maxSize);
        this.word = word;
    }

    private String generateWord(int maxSize) {
        Random random = new Random();
        int length = random.nextInt(maxSize - 1) + 1;
        for (int i = 0; i < length; i++) {
            char letter = (char) ((char) random.nextInt(25) + 97);
            word += letter;
        }

        return word;
    }

    public String[] getWordsArray() {
        String[] array = new String[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateWord(15);
        }
        return array;
    }

    public String getWord() {
        return word;
    }

}

