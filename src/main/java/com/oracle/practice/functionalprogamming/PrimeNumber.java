package com.oracle.practice.functionalprogamming;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeNumber {
        public static void main(String[] args) {
                //USING TRADITIONAL METHOD
                System.out.println(isprimeusingtraditionway(1));
                System.out.println(isprimeusingtraditionway(2));
                System.out.println(isprimeusingtraditionway(3));
                System.out.println(isprimeusingtraditionway(4));
                System.out.println(isprimeusingtraditionway(5));

                System.out.println("===============");
                System.out.println(isPrimeUsingFunctionalProgrammingConcept(1));
                System.out.println(isPrimeUsingFunctionalProgrammingConcept(2));
                System.out.println(isPrimeUsingFunctionalProgrammingConcept(3));
                System.out.println(isPrimeUsingFunctionalProgrammingConcept(4));
                System.out.println(isPrimeUsingFunctionalProgrammingConcept(5));
        }

        private static boolean isprimeusingtraditionway(int number) {
                for (int loop = 2; loop < number; loop++) {
                        if (number % loop == 0)
                                return false;
                }
                return number >= 1;
        }

        private static boolean isPrimeUsingFunctionalProgrammingConcept(int number) {
                Predicate<Integer> isDivisible = divisor -> number % divisor == 0;
                return number >= 1 && IntStream.range(2, number).noneMatch(index -> isDivisible.test(index));
        }
}
