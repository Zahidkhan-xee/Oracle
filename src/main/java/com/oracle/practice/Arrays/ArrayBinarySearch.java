package com.oracle.practice.Arrays;

import java.util.Arrays;

public class ArrayBinarySearch {
        public static void main(String[] args) {
                int[] array = {1,2,4,5,6,7,10,100};
                char[] array2 = {'c','d','e','f','g'};
                String[] array3 = {"Hello","how","Are","U"};

                System.out.println(Arrays.binarySearch(array,10));
                System.out.println(Arrays.binarySearch(array2,'d'));
                System.out.println(Arrays.binarySearch(array3,"Are"));

                Arrays.sort(array3);
                System.out.println(Arrays.binarySearch(array3,"Are"));
                System.out.println(Arrays.binarySearch(array3,"U"));


        }
}
