package com.oracle.practice.arraylist;

import java.util.ArrayList;

public class IntermediateArrayList {
        public static void main(String[] args) {
                ArrayList<String> names = new ArrayList();
                names.add("hello");
                names.remove("hello");

                System.out.println(names);

                names.remove("hello");
                System.out.println(names);

                names.add("hi");
                names.add("zahid");
                System.out.println(names);
                names.remove("hi");
                System.out.println(names);

                names.set(0,"Hi Zahid");
                System.out.println(names);


                ArrayList<String> namesOfSchool = new ArrayList<>();
                System.out.println(namesOfSchool.size());

                namesOfSchool.add("Standard Public School Hawal Srinagar");
                System.out.println(namesOfSchool.size());

                System.out.println(namesOfSchool.isEmpty());

                System.out.println(namesOfSchool.getClass());

                System.out.println(namesOfSchool);

                ArrayList backup = new ArrayList();
                backup.add("Standard Public School Hawal Srinagar");
                System.out.println(backup);

                System.out.println(backup.equals(namesOfSchool));

                backup.clear();
                namesOfSchool.clear();

                backup.add("a");
                backup.add("b");

                namesOfSchool.add("b");
                namesOfSchool.add("a");

                namesOfSchool.clear();
                namesOfSchool.add("a");
                namesOfSchool.add("b");

                System.out.println(namesOfSchool.equals(backup));



        }
}
