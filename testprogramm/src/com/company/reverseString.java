package com.company;

public class reverseString {
    public String reversemethode(String x){
        StringBuilder sbl = new StringBuilder(x);
        String reverse_x = sbl.reverse().toString().toLowerCase();
        String r_x = reverse_x.toUpperCase().charAt(0) + reverse_x.substring(1,reverse_x.length());
        System.out.println(r_x);
        return r_x;
    }
}
