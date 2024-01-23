package com.enigma.java_oop;

public class Cow extends Mammal{
    public void makeSoun(){
        System.out.println("Moooo");
    }
    public void breathe(){
        System.out.println("Cow is breathing");
        super.breathe();
    }
}
