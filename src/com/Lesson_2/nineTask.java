package com.Lesson_2;
class   nineTask {
    public static void  main (String[] args){
        int a = 1;
        int b = 0;
        for(int i = 0; i <=256; i += a){
            a = a * 2;
            b = b+a ;
            System.out.println(b +1);
        }
    }
}