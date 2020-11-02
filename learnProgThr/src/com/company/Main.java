package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(ANSI_PURPLE + "Hello from the Main thread");// first main output

        Thread anotherthread = new AnotherThread();// create new thread
        anotherthread.start();

        //anotherthread.setName("== Another Thread ==");
        // To execute the AnotherThread before the last Main println
        //t.join();



        new Thread(){
            public void run() {
                try {
                    anotherthread.join();
                    System.out.println(ANSI_GREEN+"The other thread terminated, so Ia m running again");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(ANSI_GREEN+"I could not wait after long. I was interrupted");
                }
                System.out.println(ANSI_GREEN + "Hello from the annonymous class thread");
            }
        }.start();//Creation et lancer un Annonymous thread



        //Thread myrunnable = new Thread(new MyRunnable());//Creation d'un thread that implement Runnable
        //myrunnable.start();



        Thread new_myrunnable = new Thread(new MyRunnable(){
            @Override
            public void run() {
                // Création d'un thread ou on change la méthode run
                try {
                    anotherthread.join();
                    System.out.println(ANSI_RED+ "Another thread terminated or time down So Iam running again");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(ANSI_RED+"I could not wait after all. I was interrupted");
                }
                System.out.println(ANSI_RED+"Hello from a new implementation of MyRunable");
            }
        });
        new_myrunnable.start();
        anotherthread.interrupt();
        System.out.println(ANSI_PURPLE + "I am the Main function");


    }

}
