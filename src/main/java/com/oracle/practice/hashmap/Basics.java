package com.oracle.practice.hashmap;

import java.util.HashMap;

public class Basics {

        public static void main(String[] args) {
                HashMap<Integer, String> student = new HashMap<>();
                student.put(null, "Zahid");
                student.put(null, "1");
                student.put(null, "2");


                student.put(1, "Zahid");
                student.put(2, "Ahtisham");
                student.put(3, "Aaqib");
                student.put(4, "Arslan");
                student.put(5, "Al Tahir");
                student.put(6, "Sahil");
                student.put(7, "Anwar");



                System.out.println(student);

        }
}
