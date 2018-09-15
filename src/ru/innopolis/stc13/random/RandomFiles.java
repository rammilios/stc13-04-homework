package ru.innopolis.stc13.random;

import java.io.*;

public class RandomFiles {
    public void getFiles(String path, int n, int size) {

        for (int i = 1; i < n + 1; i++) {
            String filepath = String.format("%stext%2d.txt", path, i);
            RandomParagraph paragraph = new RandomParagraph();
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filepath))) {
                try (FileInputStream fileInputStream = new FileInputStream(filepath)) {
                    while (fileInputStream.available() < size) {
                        dataOutputStream.writeUTF(paragraph.getParagraph());
                        System.out.println("Файл сгенерирован");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
