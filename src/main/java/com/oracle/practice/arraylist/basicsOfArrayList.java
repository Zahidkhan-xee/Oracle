package com.oracle.practice.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class basicsOfArrayList {
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
                System.out.println(student);


        }
}
