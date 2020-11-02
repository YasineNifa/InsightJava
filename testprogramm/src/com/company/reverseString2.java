package com.company;

public class reverseString2 {
    public String reversemethode(String x){
        StringBuilder stbr = new StringBuilder(x);
        StringBuilder stbr1 = new StringBuilder();
        for (int i = stbr.length()-1; i>-1; i--){
            if (i==stbr.length()-1){
                //stbr1.append(stbr.charAt(i));
                stbr1.append(Character.toUpperCase(stbr.charAt(i)));
            }
            else{
                stbr1.append(Character.toLowerCase(stbr.charAt(i)));
            }

        }
        String reversed_x = stbr1.toString();
        System.out.println(reversed_x);
        return reversed_x;
    }
}
