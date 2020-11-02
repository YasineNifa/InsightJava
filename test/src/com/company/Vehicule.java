package com.company;

public class Vehicule {
    private final String marque;

    public Vehicule(String marque) {
        this.marque = marque;
    }
}

class Voiture extends Vehicule{
    public String marque;
    public Voiture(String marque) {
        super(marque);
        this.marque = marque;
    }
}

class Moto extends Vehicule{
    public String marque;
    public Moto(String marque) {
        super(marque);
        this.marque = marque;
    }
}

