package com.oracle.practice.Strings;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("programming");
        String sub = stringBuilder.substring(stringBuilder.indexOf("g"));

        int len = sub.length();
        System.out.println(len);
        System.out.println(sub);


    }
}
