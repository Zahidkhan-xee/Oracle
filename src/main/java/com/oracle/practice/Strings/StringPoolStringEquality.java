package com.oracle.practice.Strings;

public class StringPoolStringEquality {
    public static void main(String[] args) {
        String name = "zahid";
        String anotherName = "zahid";
        String zahid = "zah" + "id";
        String newName = new String("zahid");
        String zah = "zah";
        String id = "id";


        System.out.println("Name == anotherName -> " + (name == anotherName));
        System.out.println("Name == zahid -> " + (name == zahid));
        System.out.println("Name == newName -> " + (name == newName));
        System.out.println("Name == zah+id " + (zahid == (zah + id)));


        System.out.println("Name equals anotherName -> " + name.equals(anotherName));
        System.out.println("Name equals zahid -> " + name.equals(zahid));
        System.out.println("Name equals newName -> " + name.equals(newName));
        System.out.println("Name equals zah+id " + zahid.equals(zah + id));


    }
}
