package com.oracle.practice.functionalprogamming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class DoubleOfFirstEvenNumberGreaterThan3 {
        public static void main(String[] args) {
                List<Integer> values = Arrays.asList(5, 6, 3, 1, 6);
                System.out.println(doubleChosenValue(values));
                System.out.println(doubleChosenValueUsingFunctionalProgramming(values));

                List<Integer> test = Arrays.asList(1, 2, 3, 4, 5,6);
                System.out.println(test.stream().filter(x -> x > 5).
                        filter(x -> x % 2 == 0).
                        map(x -> x * 4).
                        findFirst().get()
                );
        }

        private static int doubleChosenValue(List<Integer> values) {
                for (int value : values) {
                        if (value % 2 == 0 && value > 3)
                                return value * 2;

                }
                Collections.sort(values);
                return values.get(0);
        }

        private static int doubleChosenValueUsingFunctionalProgramming(List<Integer> values) {
                Predicate<Integer> greaterThan3 = value -> value > 3;
                Predicate<Integer> dividendBy2 = value -> value % 2 == 0;

                return values.stream().
                        filter(greaterThan3).
                        filter(dividendBy2).
                        map(e -> e * 2).
                        findFirst().get();
        }
}
