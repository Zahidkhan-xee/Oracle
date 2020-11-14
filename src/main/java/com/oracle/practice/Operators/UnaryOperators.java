package com.oracle.practice.Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int e =5;
        int f = ++e * 5 / e-- + e++;
        /* 6 * 5 / 6 + 5
         * 30 / 6 +5
         * 10
         */
        System.out.println(f);
        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 +2 * g-- - h-- % --g;
        /*
        * 3 + 5 * 3 + 2 * 5 - 3 % 3
        * 3 + 15 + 10 - 0
        * 28
        *
        *
         */
        System.out.println(i);

    }
}
