package com.Lesson_2;
import java.util.Scanner;
class   twelwe {
    public static void main(String[] args) {
        int i = 3;
        int z = 0;
        for (; i >= 0; --i) {
               for(int a = 0; a<=i; a++){
                   System.out.print(" ");
               }
               for(int b = 3; b>=i; --b){
                   System.out.print("*");
               }
               System.out.println();
        }
        System.out.println();

        for (; z <= 3; z++) {
            for(int a = 0; a<=z; a++){
                  System.out.print(" ");
                 }
            for(int b = 3; b>=z; --b){
                  System.out.print("*");
                 }
            System.out.println();
        }
         System.out.println();
    }
}
