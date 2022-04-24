package com.Lesson_3;

import java.util.Random;

public class Main11 {
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
        int proisvedenie = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 3 == 0) {
                if (proisvedenie == 0) {
                    proisvedenie = array1[i];
                } else {
                    proisvedenie = proisvedenie * array1[i];
                }
            }
        }
        if (proisvedenie == 0) {
            System.out.println("В массиве нет чисел кратных трем");
        } else {
            System.out.print(proisvedenie);
        }
    }
}
