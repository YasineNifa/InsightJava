package com.company;

public class Main {

    public static void main(String[] args){
        Countdown x = new Countdown();
	    Thread t1 = new countdownThread(x);
	    Thread t2 = new countdownThread(x);
	    t1.setName("Thread A");
        t2.setName("Thread B");
        t1.start();
        t2.start();
    }
}


class Countdown{
    public int i;
    public void tocountdown(){
        String color;
        switch(Thread.currentThread().getName()){
            case "Thread A":
                color = ColorThread.ANSI_CYAN;
                break;
            case "Thread B":
                color = ColorThread.ANSI_BLUE;
            default:
                color = ColorThread.ANSI_RED;
        }
        //not primitif inside synchronize
        synchronized (this){
            i = 10;
            while(i>0){
                System.out.println(color+Thread.currentThread().getName() + " : i = "+ i);
                i--;
            }
        }



    }
}


//        for (int i =10;i>0;i--){
//            System.out.println(color+Thread.currentThread().getName() + " : i = "+ i);
//        }



class countdownThread extends Thread{
    public Countdown x;
    public countdownThread(Countdown countdownobject){
        x = countdownobject;
    }
    //private Countdown c = new Countdown();
    public void run() {
        x.tocountdown();
    }
}
