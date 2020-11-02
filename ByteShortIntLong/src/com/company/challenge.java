package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class challenge {
    public static void main(String[] args){
//        int[] scores ={1500,900,400,50};
//        List<int[]> mylist = Arrays.asList(scores);
//        System.out.println(mylist);
        String name = "Yassine";
        int score = 50;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name,position);
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " Manage to get into position "+ position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if (score > 1000){
            return 1;
        }
        else if (score > 500 && score < 1000){
            return 2;
        }
        else if (score > 100 && score < 500 ){
            return 3;
        }
        return 4;

    }
}
