package com.mycompany.week14_labsession_problems;

import java.util.Random;
import java.io.*;

public class TestData {

    public static void main(String[] args) {

        try {
            final int MAX = 10;
            int value;
            String fileName = "test.txt";
            PrintWriter outFile = new PrintWriter(fileName);
            Random rand = new Random();
            for (int line = 1; line <= MAX; line++) {
                for (int num = 1; num <= MAX; num++) {
                    value = rand.nextInt(90) + 10;
                    outFile.print(value + " ");
                }
                outFile.println();
            }
            outFile.close();
            System.out.println("Output file has been created: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File not found " + e.getMessage());
        } finally {
            System.out.println("Im Done!");
        }
    }
}
