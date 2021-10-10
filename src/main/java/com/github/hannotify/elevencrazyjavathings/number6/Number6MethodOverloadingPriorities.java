package com.github.hannotify.elevencrazyjavathings.number6;

public class Number6MethodOverloadingPriorities {

    public static void printSum(Integer a, Integer b){
        System.out.format("In Integer: %d%n", a + b);
    }

    public static void printSum(double a, double b){
        System.out.format("In double: %f%n", a + b);
    }
}
