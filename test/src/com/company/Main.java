package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicule v1 = new Voiture("DeLorean");
        Vehicule v2 = new Moto("Kaneda");
        Vehicule v3 = new Voiture("DeLorean");

        //if (v1.equals(v1)) {
         //   System.out.println("v1 est identique à lui-même.");
        //}

        /*if (v1.equals(v2)) {
            System.out.println("v1 est identique à v2.");
        }

        if (v3.equals(v3)) {
            System.out.println("v3 est identique à v3.");
        }
        if (v1==v1){
            System.out.println("v1 est identique à lui-même.");
        }*/
        Vehicule v = new Vehicule("DeLorean");

        System.out.println(v.getClass());
    }
}


