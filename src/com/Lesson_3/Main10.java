package com.Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите  число");
        int n = scan.nextInt();
        for (; n < 3; ) {
            System.out.println("Вы ввели неверное число");
            System.out.println("Введите  число");
            n = scan.nextInt();
        }

        int[] array1 = new int[n];
        Random Number = new Random();
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            int random = Number.nextInt(n);
            array1[x] = random;
            System.out.print(array1[x] + " ");
            x++;

        }
        int r = 0;

        for (int k : array1) {
            int e = k % 2;
            if (e == 0) {
                r++;
            }
        }
        int[] array2 = new int[r];
        System.out.println();
        int q = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[q] = array1[i];

                System.out.print(array2[q] + " ");
                q++;
            }
        }
    }
}
