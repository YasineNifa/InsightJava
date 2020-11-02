package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static int[] readIntegers(int count){
        int[] arrays = new int[count];
        for (int i =0;i<count;i++){
            arrays[i] = sc.nextInt();
        }
        return arrays;
    }
    public static void reverse(int[] arrays){
        int n = arrays.length;
        for (int i = 0;i<n/2;i++){
            int tmp = arrays[i];
            arrays[i] = arrays[n-1-i];
            arrays[n-1-i] = tmp;
        }
        //displayarrays(arrays);

    }



    public static void main(String[] args) {
        //System.out.println("Please enter the length of the array : ");
        //int count = sc.nextInt();
        //System.out.println("Please enter the elements of the liste : ");
        //int[] liste = readIntegers(count);

        //int x = findMin(liste);
        //System.out.println("Le min de la liste est : "+ x);
        int[] x = {1,2,4,3,5};
        //displayarrays(x);
        System.out.println("Array : " + Arrays.toString(x));
        System.out.println("+++++++++++++");
        reverse(x);
        System.out.println("reversed array : "+ Arrays.toString(x));

    }
    public static void displayarrays(int[] arrays){
        for (int i =0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
    }
    public static int findMin(int[] arrays){
        int min = arrays[0];
        for (int i = 1;i<arrays.length;i++){
            if (arrays[i]<min){
                min = arrays[i];
            }
        }
        return min;
    }


}
