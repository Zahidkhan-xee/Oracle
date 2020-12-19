package com.oracle.practice.Arrays;

public class Label {
        public static void main(String[] args) {
/*
                ILLEGAL_LABEL:
                int[] array = new int[4];
*/
                String[] fruits = {"Apple", "Banana", "Grapes", "Cherry"};
                for (String fruit : fruits) {
                        if ("Apple".equals(fruit)) {
                                System.out.println("Equals");
                                break;
                        }
                }

                MY_LOOP:
                for (String fruit : fruits) {
                        if ("Apple".equals(fruit)) {
                                System.out.println("Equals.");
                                break MY_LOOP;
                        }
                }
        }
}
