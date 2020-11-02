package com.company;

import java.util.ArrayList;

public class Main {
    private static ArrayList<String> mylist = new ArrayList<String>();
    public static void addGroceryItem(String item){
        mylist.add(item);
    }
    public static void printGroceryList(){
        System.out.println("You have "+ mylist.size() + " items in your grocery list");
        for (int i = 0;i<mylist.size();i++){
            System.out.print(mylist.get(i) + ", ");
        }
    }
    public static void updateGroceryList(int position, String item){
        mylist.set(position,item);
    }
    public static void removeItem(int position){
        mylist.remove(position);
    }
    public static String findItem(String searchItem){
        //boolean exist = mylist.contains(searchItem);
        int position = mylist.indexOf(searchItem);
        if (position == -1){
            return searchItem + "don t exist";
        }
        else {
            return searchItem + " exists";
        }
    }
    public static void main(String[] args) {
        addGroceryItem("PC");
        addGroceryItem("tablette");
        addGroceryItem("velo");
        addGroceryItem("book");
        //printGroceryList();
        updateGroceryList(1,"ballon");
        //printGroceryList();
        removeItem(2);
        //printGroceryList();
        System.out.println(findItem("ballon"));
    }
}
