package com.Lesson_3;

import java.util.Random;

public class Main7 {
    public static void main(String[] args) {
        Random Number = new Random();
        int dlinnaMassiva = 12;
        int[] array = new int[dlinnaMassiva];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            int random = Number.nextInt(15);
            array[x] = random;
            System.out.print(array[x] + " ");
            x++;
        }
        System.out.println();
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length  ; i++) {
          if (array[i] >= a ) {
                a = array[i];
                b = i;
            }

        }
        System.out.println("Наибольшее число : " + a);
        System.out.println("Индекс ячейки наибольшего числа : " + b);


    }
}
