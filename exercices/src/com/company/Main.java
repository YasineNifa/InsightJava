package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {
    // write your code here
    private static final String INVALID_MESSAGE = "invalid value";
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        double result;
        result = (double)(kilometersPerHour/1.609);
        return Math.round(result);
    }
    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = "+ result + " mi/h");
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println(INVALID_MESSAGE);
        }
        else {
            int result = (int)(kiloBytes/1024);
            int res = kiloBytes%1024;
            System.out.println(kiloBytes+ " KB = "+ result + " and "+ res+ "KB");
        }

    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean wake = false;
        if (hourOfDay > -1 && hourOfDay < 24){
            if (barking && (hourOfDay < 8 || hourOfDay > 22)){
                wake = true;
                System.out.println(wake);
                return wake;
            }
        }
        System.out.println(wake);
        return wake;
    }
    public static boolean isLeapYear(int year){
        boolean leap = false ;
        if (year >= 1 && year <= 9999){
            if(year%4 == 0){
                if (year%100 == 0){
                    if (year%400 == 0){
                        return true;

                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        boolean equals = false;
        int num1 = (int)(x*1000);
        int num2 = (int)(y*1000);
        if (num1 == num2){
            equals = true;
        }
        System.out.println(equals);
        return equals;
    }
    public static boolean hasEqualSum(int x, int y, int z){
        boolean equals = false;
        if (x + y == z){
            equals = true;
        }
        return equals;
    }
    public static boolean hasTeen(int x,int y, int z){
        boolean teen = false;
        if ((x>= 13 && x<= 19)||(y>= 13 && y<= 19)||(z>= 13 && z<= 19)){
            teen = true;
        }
        return teen;

    }
    public static boolean isTeen(int x){
        boolean teen = false;
        if(x>=13 && x<=19){
            teen = true;
        }
        return teen;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || !(inches >= 0 && inches <= 12)){

            return -1;
        }

        double result = feet * 12 * 2.54 + inches * 2.54;
        return result;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        else {
            int result = (int)(inches/12);
            int remaining = (int)(inches%12);

            System.out.println(inches + " has "+ result +" feet and "+ remaining+ " inch");
            double x = (double)(inches/12);
            return x;
        }
    }
    public static void getDurationString(int minutes,int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            System.out.println(INVALID_MESSAGE);
        }
        else{
            int hour = (int) (minutes/60);
            int reamins_min = minutes%60;
            String hourstring = hour + "h";
            String minstring = reamins_min + "m";
            String secondstring = seconds + "s";
            if (hour<10){
                hourstring = "0"+hourstring;
            }
            if (reamins_min<10){
                minstring = "0"+minstring;
            }
            if (seconds<10){
                secondstring = "0"+secondstring;
            }
            System.out.println(hourstring+ " "+ minstring + " "+ secondstring);

        }

    }
    public static void getDurationString(int seconds){
        if (seconds<0){
            System.out.println(INVALID_MESSAGE);
        }
        else{
            int min = (int)(seconds/60);
            int remains_second = seconds%60;

            getDurationString(min,remains_second);

        }
    }


















    public static void main(String[] args) {
        // write your code here
//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(25.42);
//        printConversion(75.114);
//        System.out.println(Math.round(1.45));
//        System.out.println((2500-2500%1024)/1024);
//        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(-1024);
//        printMegaBytesAndKiloBytes(5000);
//
//
//        shouldWakeUp(true,1);
//        shouldWakeUp(false,2);
//        shouldWakeUp(true,8);
//        shouldWakeUp(true,-1);
//
//
//        isLeapYear(1700);
//        isLeapYear(1800);
//        isLeapYear(1900);
//        isLeapYear(2100);
//        isLeapYear(2200);
//        isLeapYear(2300);
//        isLeapYear(2500);
//        isLeapYear(2600);
//        isLeapYear(1600);
//        isLeapYear(2000);
//        isLeapYear(2400);
//        isLeapYear(-1600);
//
//        System.out.println("======================");
//        areEqualByThreeDecimalPlaces(-3.1756,-3.175);
//        areEqualByThreeDecimalPlaces(3.175,-3.176);
//        areEqualByThreeDecimalPlaces(3.0,3.0);
//        areEqualByThreeDecimalPlaces(-3.123,3.123);

//        double x = calcFeetAndInchesToCentimeters(1,2);
//        System.out.println(x);
//
//        x = calcFeetAndInchesToCentimeters(19);
//        System.out.println(x);

        getDurationString(100);
        getDurationString(61,0);
    }
}

