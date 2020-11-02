package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Messages msg = new Messages();
        (new Thread(new Writer(msg))).start();
        (new Thread(new Reader(msg))).start();

    }
}

class Messages{
    private String msg;
    private boolean isempty = true;//No more messages to read

    public synchronized String read(){
        while (isempty){
            try{
                wait();
            }
            catch(InterruptedException e) {

            }
        }
        isempty = true;
        notify();
        return msg;
    }

    public synchronized void write(String message){
        while(!isempty){
            try{
                wait();
            }
            catch(InterruptedException e) {

            }
        }
        isempty = false;

        this.msg = message;
        notify();
    }
}

class Writer implements Runnable {
    private Messages msg;
    public Writer(Messages m){
        msg = m;
    }
    @Override
    public void run() {
        String[] messages = {
                "aaaaaaaaaaaaa",
                "bbbbbbbbbbbbb",
                "ccccccccccccc"
        };
        Random r = new Random();
        for (int i = 0; i<messages.length; i++){
            msg.write(messages[i]);
            try {
                Thread.sleep(r.nextInt(2000));
            }
            catch (InterruptedException e){

            }

        }
        msg.write("finished");

    }
}

class Reader implements Runnable{
    private Messages msg;
    public Reader(Messages message){
        msg = message;
    }
    @Override
    public void run() {
        Random r = new Random();
        for (String lastmessage = msg.read(); ! lastmessage.equals("finished"); lastmessage = msg.read() ){
            System.out.println(lastmessage);
            try{
                Thread.sleep(r.nextInt(2000));
            }
            catch(InterruptedException e){

            }
        }
    }
}
