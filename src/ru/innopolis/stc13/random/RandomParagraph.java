package ru.innopolis.stc13.random;

import java.util.Random;

public class RandomParagraph {
    public String getParagraph() {
        Random random = new Random();
        RandomSentence sentence = new RandomSentence(15);
        String paragraph = "";
        for (int i = 0; i < random.nextInt(20); i++) {
            paragraph += sentence.getSentence();
        }
        paragraph += "\r\n";
        return paragraph;
    }
}
