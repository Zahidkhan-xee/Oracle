package com.oracle.practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

        public static void main(String[] args) {
                List<String> countries = new ArrayList<>(Arrays.asList("India","Africa","Pakistan"));
                System.out.println("Before sorting : ");
                System.out.println(countries);

                Collections.sort(countries);

                System.out.println("After sorting : ");
                System.out.println(countries);

                countries = new ArrayList<>(Arrays.asList("1"));
                countries.add("3");
                countries.add("10");
                countries.add("900");
                countries.add("4");
                countries.add("100");
                countries.add("65");
                countries.add("0200");
                System.out.println("Before sorting : ");
                System.out.println(countries);

                Collections.sort(countries);
                System.out.println("After sorting : ");
                System.out.println(countries);



        }
}
