package com.oracle.practice.Basics;

public class WrapperTypes {
    public static void main(String[] args) {
        //Boxing
        Integer integer = new Integer(10);
        Integer integer1 = Integer.valueOf(10);
        Integer integer2 = 10;
        Integer integer3 = Integer.valueOf("10");
        Integer integer4 = null;

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        System.out.println(integer4);

        //Unboxing
        int x = integer;
        System.out.println(x);

        x = integer1;
        System.out.println(x);

        x = integer2;
        System.out.println(x);

        x = integer3;
        System.out.println(x);

        //AUtoboxing
        printSum(1, 2);
        printSum(integer1, integer2);


    }

    static void printSum(Integer number1, Integer number2) {
        System.out.println(number1 + number2);
        int x = 1_2______3__________3;
    }
}
