package com.Lesson_3;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random Number = new Random();
        int[] array = new int[20];
        int x = 0;
        for (int i = 0; i < 20; i++) {
            int random = Number.nextInt(20);
            array[x] = random;
            System.out.print(array[x] + " ");
            x++;
        }

        for (int j = 0; j < 20; j++) {
            int t = j % 2;
            if (t != 0) {
                array[j] = 0;
            }
        }
        System.out.println();

        for (int c = 0; c < array.length; c++) {
            System.out.print(array[c] + " ");
        }
    }
}