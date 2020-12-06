package com.oracle.practice.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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

                Set<Entry<Integer, String>> entrySet = student.entrySet();
                for (Entry<Integer, String> entry : entrySet) {
                        System.out.println("Entry : " + entry.getKey() + " : Value : " + entry.getValue());
                }

                HashMap<Integer, String> mcaStudents = new HashMap<>();
                mcaStudents.put(1704511007,"ZAHID KHAN");
                mcaStudents.put(1704511029,"Ahtisham Shafi");
                mcaStudents.put(1704511035,"Junaid KHan");

                student.putAll(mcaStudents);

                entrySet = student.entrySet();
                for (Entry<Integer,String>entry : entrySet)
                        System.out.println(entry.getKey() + " = > " + entry.getValue());


        }
}
