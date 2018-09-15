package ru.innopolis.stc13.random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            String path = "C:\\Users\\user\\Desktop\\Java\\";
            RandomFiles file = new RandomFiles();
            file.getFiles(path, 5, 100);

        }
    }
}
