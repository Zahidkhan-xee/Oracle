package com.oracle.practice.hashSets;

public class HashSetOnPratice {
    public static void main(String[] args) {
	java.util.HashSet<String> hashSet = new java.util.HashSet<>();
	hashSet.add("Zahid");
	hashSet.add("Arif");
	hashSet.add("Khan");
	hashSet.add("Husaif");
	hashSet.add("AHtisham");
	hashSet.add("Software");
	hashSet.add("Engineer");
	hashSet.add("Maryam");
	hashSet.add("Himayu");
	hashSet.add("Satya");
	hashSet.add("Vishal");
	hashSet.add("I Dont know");

	System.out.println(hashSet);

	hashSet.remove("Zahid");
	System.out.println(hashSet);

	boolean successful = hashSet.remove("Remove");
	System.out.println(successful);

	hashSet.contains("Zaihid");
	hashSet.add("Zaihid");
	successful = hashSet.contains("Zaihid");
	System.out.println(successful);


    }
}