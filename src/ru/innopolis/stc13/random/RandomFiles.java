package ru.innopolis.stc13.random;

import java.io.*;

public class RandomFiles {

    public void getFiles(String path, int n, String[] words, int size, int probability) {

        int currentSize;
        String line;

        for (int i = 1; i <= n; i++) {
            currentSize = 0;

            String filepath = String.format("%stext%2d.txt", path, i);

            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filepath))) {
                while (currentSize < size) {
                    RandomParagraph paragraph = new RandomParagraph(words, probability);
                    line = paragraph.getParagraph();
                    currentSize += line.getBytes("UTF-8").length;
                    if (currentSize < size) {
                        dataOutputStream.writeUTF(line);
                    }
                }
                System.out.println("Файл сгенерирован");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
