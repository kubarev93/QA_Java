package com.Lesson_3;

public class Main2 {
    public static void main(String[] args) {
        int Number = 99 - (99/2);
        int[] array = new int[Number];
        int x = 0;
        for (int i = 1; i <= 99; i++) {
            int b = i % 2;
            if (b != 0) {
                array[x] = i;
                System.out.print(array[x] + " ");
                x++;
            }
        }
        System.out.println();
        for (int c = array.length -1; c >= 0; c--) {
            System.out.print(array[c] + " ");

        }
    }
}
