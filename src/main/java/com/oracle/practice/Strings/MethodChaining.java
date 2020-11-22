package com.oracle.practice.Strings;

public class MethodChaining {
    public static void main(String[] args) {
        String start = "             Java          ";
        String trimmedStart = start.trim();
        String lowerTrimmedStart = trimmedStart.toLowerCase();

        String builderPattern = "             Java          ".trim().toLowerCase();
        if(lowerTrimmedStart.equals(builderPattern))
            System.out.println("Equals");

    }
}
