package com.Lesson_3;

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        Random Number = new Random();
        int dlinnaMassiva = 4;
        int[] array = new int[dlinnaMassiva];
        int x = 0;
        for (int i = 0; i < dlinnaMassiva; i++) {
            int random = Number.nextInt(10);
            array[x] = random;
            System.out.print(array[x] + " ");
            x++;
        }

        boolean res = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                res = true;
            }
        }
        System.out.println();
        if (res == true) {
            System.out.println("Массив не возрастающий");
        } else {
            System.out.println("Массив возрастающий");
        }

    }
}
