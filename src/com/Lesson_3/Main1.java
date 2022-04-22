package com.Lesson_3;

public class Main1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x = 0;
        for (int i = 2; i <= 20; i++) {
            int b = i % 2;
            if (b == 0) {
                array[x] = i;
                System.out.print(array[x] + " ");
                x++;
            }
        }
        System.out.println();
        for (int c = 0; c < array.length; c++) {
            System.out.println(array[c]);
            System.out.println();
        }
    }
}

