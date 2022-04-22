package com.Lesson_3;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random Number = new Random();
        int[] array = new int[15];
        int x = 0;
        int even = 0;
        for (int i = 0; i < 15 ; i++) {
            int random = Number.nextInt(99);
            array[x] = random;
            System.out.print(array[x] + " ");
            x++;
        }
        System.out.println();
        for (int c = 0; c < 15; c++) {
            int t = array[c] % 2;
            if(t == 0 ){
                even++;
            }
        }
        System.out.println("Колличество четных чисел : "+ even);

    }
}
