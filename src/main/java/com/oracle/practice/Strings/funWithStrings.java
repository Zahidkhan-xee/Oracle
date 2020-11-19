package com.oracle.practice.Strings;

public class funWithStrings {
    public static void main(String[] args) {
        String hello = "hello";
        String world = "world";
        String helloworld = hello + world;

        System.out.println(System.identityHashCode(hello));
        System.out.println(System.identityHashCode(world));
        System.out.println(System.identityHashCode(helloworld));

        System.out.println(10 + 20 + 30 + hello);   //=> 60hello
        System.out.println(10 + 20  + hello + 30);   //=> 30hello30
        System.out.println(hello+ 10 + 20 + 30 + 40 );   //=> hello10203040
    }
}
