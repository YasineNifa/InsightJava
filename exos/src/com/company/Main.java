package com.company;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "invalid value";
    public static double area(double radius){
        if (radius < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }
        return radius*radius*Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y<0){
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }
        return x*y;
    }
    public static void printEqual(int x,int y,int z){
        if (x<0||y<0||z<0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else if (x == y && x == z){
            System.out.println("All numbers are equal");
        }
        else if (x != y && y != z && x != z){
            System.out.println("All numbers are different");
        }
        else
            System.out.println("Neither all are equal or different");

    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        boolean isplaying = false;
        if (summer){
            if (temperature <= 45 && temperature >= 25){
                isplaying = true;
                return isplaying;
            }
            else
                return isplaying;
        }
        else {
            if (temperature <= 35 && temperature >= 25) {
                isplaying = true;
                return isplaying;
            } else
                return isplaying;
        }
    }


    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        else {
            long year =minutes/(60*24*365);
            long days = (minutes - (60*24*365)*year)/(60*24);
            System.out.println(minutes+" min = "+ year +" y and "+ days+ " d");
        }
    }
    public static void main(String[] args) {
	    System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1,4.0));
        System.out.println("======================");

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(525601);
        System.out.println("======================");
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(true,35));
    }
}
