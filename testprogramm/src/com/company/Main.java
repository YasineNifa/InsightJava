package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Method2 m2 = new Method2(2,10000);
        m2.number_of_divisible();*/

        /*Method3 m3 = new Method3(2,10000);
        m3.number_of_divisible();*/

        /*FizzBuzz ins = new FizzBuzz();
        ins.prog();*/

        /*reverseString ins = new reverseString();
        ins.reversemethode("Good Morning");*/

        /*reverseString2 ins = new reverseString2();
        ins.reversemethode("Yassine");*/

        String str = "Hello";
        System.out.println(reverseWithoutBuiderMethod(str));
    }
    public static String reverseWithBuilderMethod(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseWithoutBuiderMethod(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1;i>-1;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
