package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Method3 {
    public int firstElement;
    public int lastElement;
    public Method3(int first, int last){
        firstElement = first;
        lastElement = last;
    }
    public int number_of_divisible() {
        int cnt = 0;
        ArrayList<Integer> tab = new ArrayList<>();
        for (int i = firstElement; i < lastElement; i++) {
            int y = i;
            while (y % 2 == 0) {
                y = y / 2;
            }
            while(y%5 == 0) {
                y = y / 5;
            }
            if (y == 1) {
                cnt += 1;
                tab.add(i);
            }
        }
        System.out.println("le nombre de nombre divisible par 2 et 5 est : " + cnt);
        System.out.println(tab);
        return cnt;
    }
}
