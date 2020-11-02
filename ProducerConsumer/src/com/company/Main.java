package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final String EOF ="EOF";
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();

        MyProducer producer = new MyProducer(buffer, threadColor.ANSI_BLUE);
        Myconsumer consumer1 = new Myconsumer(buffer, threadColor.ANSI_GREEN);
        Myconsumer consumer2 = new Myconsumer(buffer, threadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();

    }
}
class MyProducer implements Runnable{
    private List<String> buffer;
    private String color;
    public MyProducer(List<String> buffer , String color){
        this.buffer = buffer;
        this.color = color;
    }
    public void run() {
        Random r = new Random();
        String[] nums = {"1","2","3","4"};
        for (String num:nums){
            try{
                System.out.println(color+"Adding ..."+num);
                buffer.add(num);
                Thread.sleep(r.nextInt(2000));
            }
            catch(InterruptedException e){
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color + " Adding EOF and exiting ....");
        buffer.add("EOF");
    }
}
class Myconsumer implements Runnable{
    private List<String> buffer;
    Random m = new Random();
    private String color;
    public Myconsumer(List<String> buffer,String color){
        this.buffer = buffer;
        this.color = color;
    }
    @Override
    public void run() {
        while(true){
            if (buffer.isEmpty()){
                continue;
            }
            if (buffer.get(0).equals(EOF)){
                System.out.println(color + " exiting ....");
            }
            else{
                System.out.println(color + " Removing" + buffer.remove(0));
            }
        }


    }
}
