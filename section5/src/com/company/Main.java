package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] intArrays = new int[3];
//        intArrays[0] = 1;
//        intArrays[1] = 2;
//        intArrays[2] = 5;
//        System.out.println(intArrays[0]);
        //intArray.length
//        int[] intArray = {1,2,5};
//        System.out.println(intArray[2]);

//        double[] doubleArrays = {2.0,4,7.0};
//        System.out.println(doubleArrays[1]);
	// write your code here
        int[] inteArray = getIntegers(5);
        inteArray = tri_insertion(inteArray);
        for (int i = 0;i<5;i++){
            System.out.println("element number "+ i + " est : "+ inteArray[i]);
        }
    }
    public static int[] getIntegers(int number){
        int[] list = new int[number];
        for (int i=0;i<number;i++){
            list[i] = sc.nextInt();
        }
        return list;
    }
    public static int[] sortArray(int[] array){
        for (int i =0;i<array.length;i++){
            for(int j = i+1;j<array.length ;j++){
                if (array[i]<array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        return array;
    }
    public static int[] tri_bull(int[] array){
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length-1; i++) {

                if (array[i] < array[i+1]) {
                    int x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                    flag = true;
                }

            }
        }
        return array;
    }
    public static int[] tri_selection(int[] array){
        for (int i = 0;i<array.length - 1;i++){
            int max = i;
            for (int j = i+1; j<array.length;j++){
                if (array[j]>array[max]){
                    max = j;
                }
            }
            if (max != i){
                int tmp = array[max];
                array[max] = array[i];
                array[i] = tmp;
            }
        }
        return array;
    }

    public static int[] tri_insertion(int[] array){
        for (int i = 0;i<array.length;i++){
            int tmp = array[i];
            int j = i;

            while (j>0 && array[j-1]<tmp){
                array[j] = array[j-1];
                j = j-1;
            }
            array[j] = tmp;
        }
        return array;
    }
    public static double average(int[] intarray){
        double sum = 0 ;
        for (int i = 0;i<intarray.length;i++){
            sum += intarray[i];
        }
        return (double) sum/intarray.length;
    }
}
