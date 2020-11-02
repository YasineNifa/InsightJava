package com.company;

import java.util.ArrayList;

public class Method2 {
    public int firstElement;
    public int lastElement;
    public Method2(int first, int last){
        firstElement = first;
        lastElement = last;
    }
    public int number_of_divisible(){
        int cnt = 0;
        ArrayList<Integer> tab = new ArrayList<>();
	    for (int i = firstElement; i < lastElement; i++) {
            int y = i;
            while (y % 2 == 0 || y % 5 == 0) {
                if (y % 2 == 0) {
                    y = y / 2;
                }
                if (y % 5 == 0) {
                    y = y / 5;
                }
            }
            if (y == 1) {
                cnt += 1;
                tab.add(i);
            }
        }
        System.out.println("le nombre de divisible par 2 et 5 est "+ cnt);
        System.out.println(tab);
        return cnt;
    }
}
