package com.Lesson_2;

import java.util.Scanner;

class   thirdTask {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();

        if(a>0) {
            a++;
        } else if(a<0) {
            a -=2;
        } else if(a == 0) {
            a=10;
        }
        System.out.println(a);
    }
}