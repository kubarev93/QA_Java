package com.Lesson_2;
class   eleven {
    public static void  main (String[] args){
        int a = 1;
        int b = 0;
        for(int i = 1; i < 99; i += 2){
            a = a + 2;
            b = b+a ;
            System.out.println(b +1);
        }
    }
}