package com.oracle.practice.Arrays;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class ArraySort {
        public static void main(String[] args) {
                //PRINT BASIC TYPES
                int a = 2;
                char b = 65;
                float c = 4.0f;
                double d = 5.0f;
                String e = "hello baby";
                Integer f = 12;

                System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);


                int[] mark = {1, 2, 34, 5_6, 9};
                boolean[] failed = {true, false, true, false, false, false};
                double[] amount = new double[]{
                        1.0, 2.3, 4.3, 1.3, 0.6, 99, 0.2
                };

                System.out.println(Arrays.toString(mark));
                System.out.println(Arrays.toString(failed));
                System.out.println(Arrays.toString(amount));

                Double[] cash = {12.3, 31.3, 13.2, 31.3, 42.2};
                System.out.println(Arrays.toString(cash));

                Double[] vector = {12.3, 312.32, 421.3};
                System.out.println(Arrays.toString(vector));

                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5},
                        {5, 6, 7, 8}
                };
                System.out.println(deepToString(matrix));


                int[] arr = {10, 3, 1, 3, 1, 4, 54, 234, 12};
                String[] arr2 = {"he", "a", "b", "d"};
                char[] arr3 = {'b', 'c','a'};
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));

                Arrays.sort(arr3);
                System.out.println(Arrays.toString(arr3));

                Arrays.sort(arr2);
                System.out.println(Arrays.toString(arr2));
        }
}
