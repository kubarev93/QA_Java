package com.Lesson_2;

import java.util.Scanner;

class    firstTask {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();

        if (number < 10 && number > -10 && number >= 0 ){
            System.out.println("Чиcло однознозначное  положительное");
        } else if (number < 0 && number > -10){
            System.out.println("Чиcло однознозначное  отрицательное");
        } else if (number < 100 && number > -100 && number > 0 ){
            System.out.println("Чиcло двухзначное  положительное ");
        } else if (number < 0 && number <= -10 && number >= -99){
            System.out.println("Чиcло двухзначное  отрицательное ");
        } else if (number < 1000 && number > -1000 && number > 0 ){
            System.out.println("Чиcло трехзначное  положительное ");
        } else if (number < 0 && number <= -100 && number >= -1000){
            System.out.println("Чиcло трехзначное  отрицательное ");
        }

        if (number > 9999 && number > 0){
            System.out.println("Число четырехзначное и более (положительное)");
        } else if (number < -9999){
            System.out.println("Число четырехзначное и более  (отрицательное)");
        }

    }
}