package com.Lesson_3;

import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random Number = new Random();

        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            int random = Number.nextInt(9);
            array1[x] = random;
            System.out.print(array1[x] + " ");
            x++;
        }
        System.out.println();
        x = 0;
        for (int i = 0; i < array2.length; i++) {
            int random = Number.nextInt(1, 9);
            array2[x] = random;
            System.out.print(array2[x] + " ");
            x++;
        }
        System.out.println();
        double[] array3 = new double[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double) array1[i] / (double) array2[i];
            System.out.print(array3[i] + " ");
        }
    }
}
