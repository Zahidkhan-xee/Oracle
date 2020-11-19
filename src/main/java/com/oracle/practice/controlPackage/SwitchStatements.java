package com.oracle.practice.controlPackage;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        String day = new Scanner(System.in).next();

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("First day of week");
                break;
            case "tuesday":
                 System.out.println("Second day");
                break;
            default:
                System.out.println("Other day.");
            break;
        }
        int x = day.length()%10;
        switch (x){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("ODD NUMBER");
                break;
            case 2:
            case 4:
            case 0:
            case 6:
            case 8:
                System.out.println("Even Number");
                break;
            default:
                System.out.println("Not in range");
        }

    }
}
