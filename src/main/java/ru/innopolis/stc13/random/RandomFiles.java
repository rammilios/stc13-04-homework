package ru.innopolis.stc13.random;

import java.io.*;

public class RandomFiles {

    public void getFiles(String path, int n, String[] words, int size, int probability) {

        int currentSize, previousSize;
        String line;

        for (int i = 1; i <= n; i++) {
            currentSize = 0;

            String filepath = String.format("%stext%2d.txt", path, i);

            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filepath))) {
                while (currentSize < size) {
                    RandomParagraph paragraph = new RandomParagraph(words, probability);
                    line = paragraph.getParagraph();
                    previousSize = currentSize;
                    currentSize += line.length() + 2;
                    if (currentSize < size) {
                        byte[] buffer = line.getBytes();
                        bufferedOutputStream.write(buffer, 0, line.length());
                    }
                    else {
                        line = line.substring(0, size - previousSize);
                        byte[] buffer = line.getBytes();
                        bufferedOutputStream.write(buffer, 0, line.length());
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
