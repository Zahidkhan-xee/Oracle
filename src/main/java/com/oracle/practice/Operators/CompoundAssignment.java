package com.oracle.practice.Operators;

public class CompoundAssignment {
    public static void main(String[] args) {
        Long x = 100L;
        int y = 10;

        y = (int) (x * y);
        // or without explicity casting
        y*=x;

    }
}
