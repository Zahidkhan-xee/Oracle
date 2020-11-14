package com.oracle.practice.Operators;

public class NumericPromotionAndTypeCasting {
    public static void main(String[] args) {
        /*
            Promotion is conversion of the smaller datatype to larger dataType
         */
        testPromotion();
        testCasting();
    }

    static void testCasting(){
        double x = 12.5;
        int y = 12 + (int)x;
        System.out.println(y);

        int testX = 127;
        byte testY = 12;
        int resultXY = testX + testY;

        System.out.println(resultXY);
        byte result = (byte) (testY + testX);

        System.out.println(result);
        short x1 = 14;
        short x2 = 2;
        int x3testPromotion = x1 / x2;
        int x4 = Byte.parseByte("12") + Byte.parseByte("2");

        char c;
        c = 'z'+ 128;
    }
    /**
     *  Function is one of the best functions we have.
     * This function is used for the conversion of smaller datatype to larger dateType
     */
    public static void testPromotion(){
        int x = 10;
        double y = 10.25;
        System.out.println("result : " + (x + y));

         byte bytes = 10;
        int ints = 12;
        double doubles = 12.2;

        System.out.println(bytes+ints+doubles);

    }
}
