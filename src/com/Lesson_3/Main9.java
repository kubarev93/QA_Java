package com.Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите  число");
        int a = scan.nextInt();

        for (; a <= 0; ) {
            System.out.println("Вы ввели неверное число");
            System.out.println("Введите  число");
            a = scan.nextInt();
        }
        
        int[] array1 = new int[a];
        Random Number = new Random();
        int x = 0;
        for (int i = 0; i < array1.length; i++) {
            int random = Number.nextInt(15);
            array1[x] = random;
            System.out.print(array1[x] + " ");
            x++;
        }
        int PervayaPolovina = a / 2;
        int VtorayaPolovina = a - PervayaPolovina;

        int SummaPervoiPolovini = 0;
        for (int i = 0; i < PervayaPolovina; i++) {
            SummaPervoiPolovini = SummaPervoiPolovini + array1[i];
        }
        System.out.println();
        System.out.println(SummaPervoiPolovini);

        int SummaVtoroiPolovini = 0;
        for (int i = VtorayaPolovina; i < a; i++) {
            SummaVtoroiPolovini = SummaVtoroiPolovini + array1[i];
        }
        System.out.println();
        System.out.println(SummaVtoroiPolovini);
        if (SummaPervoiPolovini > SummaVtoroiPolovini) {
            System.out.println("Сумма первой половины больше");
        } else if (SummaPervoiPolovini < SummaVtoroiPolovini) {
            System.out.println("Сумма второй половины больше");
        } else {
            System.out.println("Половины равны");
        }
    }
}
