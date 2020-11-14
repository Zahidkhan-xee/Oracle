package com.oracle.practice.Basics;

public class WholeNumberPrimitives {
    public static void main(String[] args) {
        int binary = 0b1010;
        System.out.println(Integer.toBinaryString(binary));

        int binary2 = 0b101;
        System.out.println(Integer.toBinaryString(binary+binary2));

        int octal1 = 012;
        int octal2 = 011;
        int result = octal1 + octal2;
        System.out.println(result);

        float hexa1 = 0x12E.12p3f;
        double hexa2 = 0x123.12p4;
        System.out.println(Double.toHexString(hexa1+hexa2));

    }
}
