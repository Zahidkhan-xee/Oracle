package com.oracle.practice.Operators;
import java.util.*;

public class stackoverflow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;          //t=1
        System.out.println("Please enter the value for t : ");
        t = sc.nextInt();
        while(t!=0) {
            System.out.println("Please enter the value for n : ");
            int n = sc.nextInt();     //n=5
            int a[] = new int[n];     // a = { 1,2,5,6,7 }

            for (int i = 0; i < n; i++) {
                System.out.println("Please enter the element "+ i + " : ");
                a[i] = sc.nextInt();
            }

            System.out.println("Exit ");
            int count=0,count1=0;
            for (int i = 0; i < n-1; i++) {
                if ((a[i + 1] - a[i]) > 2) {
                    count++;
                } else {
                    count1++;
                }
            }

            System.out.println("" + count+1+ " " +count1);  //this doesn't get
//            printed

            t--;
        }
    }
}
