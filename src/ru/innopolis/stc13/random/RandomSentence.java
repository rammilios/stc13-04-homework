package ru.innopolis.stc13.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomSentence {

    private ArrayList<String> sentence = new ArrayList<String>();

    public RandomSentence(int maxSize) {

        Random random = new Random();

        int length = random.nextInt(maxSize-1);
        length = length + 1;

        for (int i = 0; i < length; i++) {
            RandomWords word = new RandomWords(15);
            sentence.add(word.getWord());
        }

    }

    private void increaseFirstLetter() {

        String firstWord = sentence.get(0);

        char firstLetter = firstWord.charAt(0);
        firstLetter -= 32;
        String firstUpperWord;
        if (firstWord.length()==1){
             firstUpperWord = String.valueOf(firstLetter);
        } else {
            firstUpperWord = firstLetter + firstWord.substring(1, firstWord.length() - 1);
        }

        sentence.set(0, firstUpperWord);

    }

    public String getSentence() {

        String str = "";
        increaseFirstLetter();
        if (sentence.size() == 1) {
            str += sentence.get(0) + " ";
        } else {
        for (int i = 0; i < sentence.size() - 1; i++) {
            str += sentence.get(i) + " ";
        }
        }
        str += sentence.get(sentence.size()-1)+getSentenceEnd();


        return str;
    }



    public String getSentenceEnd() {
        String[] endOfSentence = {".", "!", "?"};
        Random random = new Random();
        return endOfSentence[random.nextInt(2)]+" ";
    }
}
