package com.Lesson_3;

import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        Random Number = new Random();
        int[] array = new int[5];
        int[] array1 = new int[5];
        int x = 0;
        for (int i = 0; i < 5; i++) {
            int random = Number.nextInt(15);
            array[x] = random;
            System.out.print(array[x] + " ");
            x++;
        }
        x = 0;
        System.out.println();
        for (int i = 0; i < 5; i++) {
            int random = Number.nextInt(15);
            array1[x] = random;
            System.out.print(array1[x] + " ");
            x++;
        }
        int summ1 = 0;
        for (int i = 0; i < 5; i++) {
            summ1 = summ1 + array[i];
        }
        int summ2 = 0;
        for (int i = 0; i < 5; i++) {
            summ2 = summ2 + array1[i];
        }
        System.out.println();

        int average1 = summ1 / 5;
        int average2 = summ2 / 5;
        System.out.println("Среднеее арифметическое первого массива : " + average1);
        System.out.println("Среднеее арифметическое второго массива : " + average2);

        if (average1 > average2) {
            System.out.println("Для первого массива среднее арифметическое больше");
        } else if (average1 < average2) {
            System.out.println("Для второго массива среднее арифметическое больше");
        } else {
            System.out.println("Среднее арифметическое двух массивов равны");
        }
    }
}