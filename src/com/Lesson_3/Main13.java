package com.Lesson_3;

import java.util.Random;

public class Main13 {
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
        int summaElementov = 0, count = 0;
        int C = Number.nextInt(13);
        System.out.println("Число С: " + C);

        for (int i = 0; i < array1.length; i++) {
            if (C < array1[i]) {
                summaElementov = summaElementov + array1[i];
                count++;
            }

        }

        System.out.println("Среднее арифметическое не четных элементов больше С : " + (double) summaElementov / count);

    }
}
