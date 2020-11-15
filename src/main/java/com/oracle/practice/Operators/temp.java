package com.oracle.practice.Operators;

public class temp {
    public static void main(String[] args) {
        Integer integer1 = 127;
        Integer integer2 = 127;
        System.out.println("integer1 == integer2 : " + (integer1 == integer2));
        integer1 = 128;
        integer2 = 128;
        System.out.println("Integer1 == Integer2 : " + (integer1 == integer2));
        integer1 = integer2 = 128;
        System.out.println("Integer1 == Integer2 : " + (integer1 == integer2));

        System.out.println(System.identityHashCode(integer1));
        System.out.println(System.identityHashCode(integer2));

    }
}
