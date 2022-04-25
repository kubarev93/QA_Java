package com.Lesson_3;

import java.util.Random;

public class Main12 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random Number = new Random();
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            int random = Number.nextInt(1, 13);
            array1[x] = random;
            System.out.print(array1[x] + " ");
            x++;
        }

        System.out.println();
        int summaElementov = 0;
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                summaElementov = summaElementov + array1[i];
                count++;
            }

        }

        System.out.println("Среднее арифметическое не четных элементов : " + (double) summaElementov / count);

    }
}
