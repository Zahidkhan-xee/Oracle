package com.oracle.practice.hashSets;

import java.util.HashSet;

public class HashsetClassObjects {
    public static void main(String[] args) {
	HashSet<Student> student = new HashSet();
	System.out.println("INSERTED IN [HASHSET] NEW OBJECT REFERENCE... ");
	student.add(new Student(1, "Zahid"));
	student.add(new Student(2, "Azra"));
	student.add(new Student(1, "Zahid"));
	student.add(new Student(2, "Azra"));
	System.out.println(student);


    }
}

class Student {
    public int rollNumber;
    public String name;

    Student(int rollNumber, String name) {
	this.rollNumber = rollNumber;
	this.name = name;
    }

    @Override
    public String toString() {
	return "\nRoll Number : " + rollNumber + " Name : " + name;
    }


}