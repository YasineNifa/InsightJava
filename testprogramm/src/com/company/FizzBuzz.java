package com.company;

public class FizzBuzz {

    public void prog(){
        for (int i = 0; i<101; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            /*if(i%3==0){
                if(i%5==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else{
                if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
            }*/
        }
    }
}
