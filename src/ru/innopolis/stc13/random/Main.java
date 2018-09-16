package ru.innopolis.stc13.random;

public class Main {
    public static void main(String[] args) {
            String path = "/Users/ramil/IdeaProjects/stc13-04-homework/out/";
            RandomFiles file = new RandomFiles();
            RandomWords words = new RandomWords(15);
            file.getFiles(path, 5, words.getWordsArray(), 1000, 1);
    }
}
