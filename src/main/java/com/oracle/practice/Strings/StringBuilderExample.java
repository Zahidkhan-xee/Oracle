package com.oracle.practice.Strings;


public class StringBuilderExample {
    public static void main(String[] args) {
        String myString = "";
        //myString => String pool and has say location 0 which contain NULL
        for (char c = 'a'; c <= 'z'; c++) {
            //I am going through a-z incremeneting and addeing a to z in the String named myString
            int previousHashCode = System.identityHashCode(myString);// Stores the location where my current string is stored.
            myString += c;
            if (previousHashCode == System.identityHashCode(myString))
                System.out.println("My instructors assertion were wrong.");
        }
        System.out.println(myString);

        System.out.println(System.identityHashCode(myString));

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        stringBuilder.append("hello");
        System.out.println(stringBuilder);
        int hashedlocation = System.identityHashCode(stringBuilder);
        System.out.println(stringBuilder.length());
        int newLocation = System.identityHashCode(stringBuilder.append("a".repeat(423)));
        if (hashedlocation == newLocation)
            System.out.println("location is same.");
        else
            System.out.println("Location is changed.");

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle");
        StringBuilder another = builder.append("-end");

        another.replace(5,13, "-mid");
        System.out.println(builder);
        System.out.println(another);

        StringBuilder myBuilder3 =  new StringBuilder();
        System.out.println("Size : "+myBuilder3.length());
        System.out.println("Size : "+myBuilder3.capacity() );

        StringBuilder stringBuilder4 = new StringBuilder(101);
        System.out.println(stringBuilder4.length());
        System.out.println(stringBuilder4.capacity());

        stringBuilder4.append("he");
        System.out.prin tln(stringBuilder4.length());
        System.out.println(stringBuilder4.capacity());




    }
}
