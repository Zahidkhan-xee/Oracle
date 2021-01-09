package com.oracle.practice.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicsOfArrayList {
        public static void main(String[] args) {
                ArrayList string = new ArrayList();
                string.add("hello");
                string.add(2);
                string.add(2.3f);
                string.add('c');
                System.out.println(string.toString());


                ArrayList<Object> stringOfObject = new ArrayList<>();
                stringOfObject.add("Hello");
                stringOfObject.add(2);
                stringOfObject.add(2.3f);
                stringOfObject.add('c');
                System.out.println(stringOfObject);


                //BY DEFAULT IT MAKES ArrayList Of Objects . .

                ArrayList<String> student =  new ArrayList<>(Arrays.asList("Zahid","arif","Shazib"));
                student.add("Azra");
                student.add(0,"Suzain");

                System.out.println(student);

                System.out.println("The first student is : "+ student.get(0));
                System.out.println("The last student is : "+ student.get(student.size()-1));

                System.out.println("Student has khalid : "+ student.contains("khalid"));
                System.out.println("Student has zahid : "+ student.contains("zahid"));


        }
}
