package com.oracle.practice.Basics;

public class ScopeOfVariables {
    static int globalnumber = 5;

    public static void main(String[] args) {
        System.out.println(globalnumber);
        {
            int globalnumber = 4;
            System.out.println(globalnumber);
        }
    }
}

