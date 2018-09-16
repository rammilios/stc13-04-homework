package ru.innopolis.stc13.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSentence {

    private List<String> sentence = new ArrayList<>();

    public RandomSentence(int maxSize, String[] words, int chance) {
        List<String> sentence = generateSentence(maxSize, words, chance);
        this.sentence = sentence;
    }

    private List<String> generateSentence(int maxSize, String[] words, int chance) {
        Random random = new Random();

        int length = random.nextInt(maxSize-1) + 1;

        for (int i = 0; i < length; i++) {
            if (chance == 1) {
                sentence.add(words[random.nextInt(words.length)]);
            } else {
                RandomWords word = new RandomWords(15);
                sentence.add(word.getWord());
            }
        }
        return sentence;
    }

    private void increaseFirstLetter() {
        String firstWord = sentence.get(0);
        firstWord = firstWord.substring(0,1).toUpperCase() + firstWord.substring(1);
        sentence.set(0, firstWord);
    }

    public String getSentence() {

        Random random = new Random();
        String str = "";
        String[] comma = {" ", ", "};
        increaseFirstLetter();

        for (int i = 0; i < sentence.size(); i++) {

            if (i != sentence.size()-1) {
                str += sentence.get(i) + comma[random.nextInt(comma.length)];
            } else {
                str += sentence.get(i);
            }
        }
        str += getSentenceEnd();
        return str;
    }

    private String getSentenceEnd() {
        String[] endOfSentence = {".", "!", "?"};
        Random random = new Random();
        return endOfSentence[random.nextInt(2)]+" ";
    }
}
