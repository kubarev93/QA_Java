package com.Lesson_2;
import java.util.Scanner;
class   fourthTask {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        System.out.println("Введите третье число");
        int c = scan.nextInt();
        int d = 0;

        if(a>0) {
            d++;
        }
        if(b>0) {
            d++;
        }
        if(c>0) {
            d++;
        }
        System.out.println("Колличество положительных чисел: " + d);
    }
}