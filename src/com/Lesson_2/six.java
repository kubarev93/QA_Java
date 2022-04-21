package com.Lesson_2;
import java.util.Scanner;
class   six {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        if (a% 10 == 1 && a%100!=11){
            System.out.println(a + " программист");
        } else if (a% 10 == 2 && a%100!=12){
            System.out.println(a + " программистa");
        } else if (a% 10 == 3 && a%100!=13){
            System.out.println(a + " программистa");
        } else if (a% 10 == 4 && a%100!=14){
            System.out.println(a + " программистa");
        } else {
            System.out.println(a + " программистов");
        }

    }
}