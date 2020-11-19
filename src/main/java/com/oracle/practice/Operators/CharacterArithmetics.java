package com.oracle.practice.Operators;

public class CharacterArithmetics {
    public static void main(String[] args) {
        char myCharA = 'A';
        char myCharB = '1';
        System.out.println("myChar : " + myCharA);
        System.out.println("MyChar is letter : " + Character.isLetter(myCharA));
        System.out.println("MyChar is digit : " + Character.isDigit(myCharA));

        System.out.println("myChar : " + myCharB);
        System.out.println("MyChar is letter : " + Character.isLetter(myCharB));
        System.out.println("MyChar is digit : " + Character.isDigit(myCharB));

        //exam examples
        char letter = 65;
        int myInt = letter + 3;
        char myNewLetter = (char) myInt;

        System.out.println("letter " + letter);
        System.out.println("myInt " + myInt);
        System.out.println("myNewLetter " + myNewLetter);

        if(letter == 'A')
            System.out.println("Letter A.");
        if (letter++ < 'C')
            System.out.println("yes");
    }


}
