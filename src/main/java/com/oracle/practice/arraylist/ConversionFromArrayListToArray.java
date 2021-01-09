package com.oracle.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionFromArrayListToArray {
        public static void main(String[] args) {
                ArrayList<String> students = new ArrayList();
                students.add("Zahid");
                students.add("Arif");
                students.add("Hena");
                students.add("Saqib");
                students.add("Fayiz");
                students.add("Al Tahir");

                Object[] studentsArray = students.toArray();
                System.out.println(Arrays.toString(studentsArray));

                String[] studentsArrays = students.toArray(new String[0]);
                System.out.println(Arrays.toString(studentsArrays));

                String[] namesOfStudent = students.toArray(new String[studentsArrays.length]);
                System.out.println(Arrays.toString(namesOfStudent));

                String[] animals = new String[]{"dog","cat","frog","elephant"};
                List<String> animalsList = Arrays.asList(animals);

                //or

                ArrayList<String> listOfAnimals = new ArrayList(Arrays.asList("dog","cat","elephant"));
                System.out.println(listOfAnimals);

                String[] namesOfStudents = new String[]{"zahid","arif","suhail"};
                List<String> listOfStudents = Arrays.asList(namesOfStudents);
                namesOfStudents = listOfStudents.toArray(new String[0]);




        }
}
