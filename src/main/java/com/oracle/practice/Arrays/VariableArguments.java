package com.oracle.practice.Arrays;

import java.util.Arrays;

public class VariableArguments {
        public static void main(String ...  args) {
                callWithVariableArgs("hello","how", "are","you");
                callWithArrays(new String[]{"array","hi"});
        }

        private static void callWithVariableArgs(String ... args) {
                for (String arg: args){
                        System.out.println(arg);
                }
                System.out.println(Arrays.toString(args));
        }

        private static void callWithArrays(String[] args){
                System.out.println(Arrays.toString(args));
        }

}
