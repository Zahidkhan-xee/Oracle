package com.oracle.practice.Strings;



public class Stringmethods2 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("=========");
        System.out.println(str1.toLowerCase().startsWith("j"));
        ;
        System.out.println(str2.startsWith("j"));
        ;
        System.out.println(str3.startsWith("j"));
        ;
        System.out.println("Starts with empty: " + str3.startsWith(""));
        ;


        System.out.println(str1.endsWith("va"));
        System.out.println(str2.endsWith("va"));
        System.out.println(str3.endsWith("va"));
        System.out.println(str3.endsWith(""));
        System.out.println(str3.endsWith(""));
        System.out.println(str3.endsWith("."));

        String msg = "Hello zahid I want to say I love you badly.";
        msg = msg.replace("zahid", "dumbu");
        System.out.println(msg);

        //trim()
        System.out.println("               .                  .            ".trim());
    }
}
