package com.oracle.practice.Operators;

public class ShortCircuiting {
    public static void main(String[] args) {
        int x, y;
        boolean z;
        x = 1;
        y = 2;
        z = false && (y++>0);


        System.out.println(z);
        System.out.println(x + " " + y);
        z = true || (x=2)>0;
        System.out.println(x);

        boolean a , c=false;
        int b = 20;

        a = (b!=10)^(c = false);
        System.out.println(a + " " + y + " " + c);
    }
}
