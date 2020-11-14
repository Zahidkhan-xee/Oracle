package com.oracle.practice.Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 - 3;
        //3-2+2*2-3
        //3-2+4-3
        //1+4-3
        //2
        System.out.println(result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        //2+1-8+10
        //3-8+10
        //-5+10
        System.out.println(result);

        int a = 4;
        int b = 3 - 2 * --a;
        System.out.println(b);
        // 3- 6
        // -3

        a = 4;
        b = 3 - 2 * a--;
        // 3 - 2 * 4
        // 3- 8
        // -5

        int f = 12;
        int g = 5;
        int h = 2;
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;

        /*
         * 12/ 2 - 10 % (7) -2 * 12 % 5 -2 * 3
         *6 - 3 - 4 -6
         * -7
         *
         * */


        System.out.println(m);
    }
}
