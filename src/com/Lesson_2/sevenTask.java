package com.Lesson_2;
class   sevenTask {
    public static void  main (String[] args){
        double a = 10;
        double c = 0;
        double d = 0;
        for(double i = 1; i <= 6; i++) {
            c = (double) (a * 0.1);
            a += c;
            d += a;
        }
        System.out.println(d + 10);
    }
}