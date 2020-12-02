package com.oracle.practice.hashSets;

import java.util.HashMap;

public class DifferentWaysOfCreatingHashMap {
    public static void main(String[] args) {
	//create a HASHMAP with initial capacity and load factor.
	HashMap<Integer, String> studentRollName = new HashMap<>();

	//creating a HASHMAP WITH INTIAL CAPACITY = 3
	HashMap<Integer, String> studentRollNameWithCapacity30 = new HashMap<>(3);
	studentRollNameWithCapacity30.put(1, "Zahid");
	studentRollNameWithCapacity30.put(2, "Suhail");
	studentRollNameWithCapacity30.put(3, "Burhan");
	studentRollNameWithCapacity30.put(4, "Arif");
	studentRollNameWithCapacity30.put(5, "kaunain");
	studentRollNameWithCapacity30.put(6, "Ahtisham");
	studentRollNameWithCapacity30.put(7, "Ayaz");
	studentRollNameWithCapacity30.put(8, "Bisma");
	studentRollNameWithCapacity30.put(9, "Uqba");

	//we can print the HASHSET DIRECTLY.
	System.out.println(studentRollNameWithCapacity30);

	//Using a simple FOR-LOOP
	for (int loop=0; loop < studentRollNameWithCapacity30.size(); loop++)
	    System.out.println("Key : " + loop + " VALUE : " + studentRollNameWithCapacity30.get(loop));

	//Using Iterators

    }
}
