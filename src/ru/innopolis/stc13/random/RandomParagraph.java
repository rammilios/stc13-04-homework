package ru.innopolis.stc13.random;

import java.util.Random;

public class RandomParagraph {

    String paragraph;

    public RandomParagraph(String[] words, int probability) {
        String paragraph = generateParagraph(words, probability);
        this.paragraph = paragraph;
    }

    private String generateParagraph(String[] words, int probability) {
        Random random = new Random();
        String paragraph = "";
        int chance;
        if (probability == 0) {
            chance = 0;
        }
        else {
            chance = random.nextInt(probability - 1) + 1;
        }
        for (int i = 0; i < random.nextInt(19) + 1; i++) {
            RandomSentence sentence = new RandomSentence(15, words, chance);
            paragraph += sentence.getSentence();
        }
        paragraph += "\r\n";
        return paragraph;
    }

    public String getParagraph() {
        return paragraph;
    }
}
