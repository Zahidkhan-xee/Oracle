package com.oracle.practice.arraylist;

import java.util.ArrayList;

public class AdvancedArrayList {
        public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(null);
                numbers.add(1);
                numbers.add(2);
                numbers.add(3);
                numbers.add(4);
                numbers.add(5); //Auto Boxing

                numbers.add(new Integer(1));
                numbers.add(new Integer(2));
                numbers.add(new Integer(3));
                numbers.add(new Integer(4));
                numbers.add(new Integer(5));
                numbers.add(new Integer(6));
                numbers.add(Integer.valueOf(7));



                System.out.println(numbers);

                numbers.remove(0);
                System.out.println(numbers);

                numbers.remove(new Integer(7));
                System.out.println(numbers);

        }
}
