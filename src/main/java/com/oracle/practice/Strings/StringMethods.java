package com.oracle.practice.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "java is fun";
        //Length
        System.out.println("Length " + str.length());

        //Charat
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));

        //IndexOF
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("n"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("ten"));

        //substring
        System.out.println(str.substring(1, 5));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 5));

        try {
            System.out.println(str.substring(4, 2));    //error
        }catch (StringIndexOutOfBoundsException e){}
    }
}
