package com.Lesson_2;

import java.util.Scanner;

class    secondTask {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника");
        int a = scan.nextInt();
        System.out.println("Введите вторую сторону треугольника");
        int b = scan.nextInt();
        System.out.println("Введите третью сторону треугольника");
        int d = scan.nextInt();

        if (a>b+d || b>a+d || d>a+b){
            System.out.println("Треугольник не существует");
        }else {
            System.out.println("Треугольник  существует");
        }

    }
}