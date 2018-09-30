package ru.innopolis.stc13.random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String path = "C:\\Users\\user\\Desktop\\Java\\";
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            RandomFiles file = new RandomFiles();
            RandomWords words = new RandomWords(15);
            file.getFiles(path, 3, words.getWordsArray(1000), 3_000, 1);
    }
}
