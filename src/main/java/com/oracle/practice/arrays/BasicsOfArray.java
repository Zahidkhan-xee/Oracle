package com.oracle.practice.arrays;

import java.util.Arrays;

public class BasicsOfArray {
    public static void main(String[] args) {
        int[] one = new int[3];
        int[] two = new int[]{10, 11, 12};
//        int[] a = new double[2.5];
        double[] b = new double[4 / 4 * 5];
        int x = 4;
        int y = 4;


        double[] c = new double[x * y];
        int[] three = {10, 11, 12};

        int[] four = {};
        int[] firstMultiArray, secondMultiArray;        //Good practice


        int firstMultiArray1[], secondM, multiArray1; //bad practice.

        String[] animals = {"Parrot","Dog","Cat"};
        String[] myAnimals= animals;
        String[] otherAnimals = {"Parrot","Dog","Cat"};

        System.out.println(Arrays.equals(animals,myAnimals));
        System.out.println(animals == myAnimals);
        System.out.println(animals == otherAnimals);
        System.out.println(Arrays.equals(animals, myAnimals));
        System.out.println(animals.equals(otherAnimals));

        System.out.println(animals);
        System.out.println(animals.toString() );

        //PRint string

        System.out.println(Arrays.toString(animals));
        System.out.println(Arrays.toString(myAnimals));
        System.out.println(Arrays.toString(otherAnimals));

    }

}
