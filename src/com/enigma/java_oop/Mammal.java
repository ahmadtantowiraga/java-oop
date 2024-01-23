package com.enigma.java_oop;

public class Mammal extends Animal{
    public void getBirth(){
        System.out.println("Mammals get birrth");
    }
    public void breathe(){
        System.out.println("mamal is breating");
        super.breathe();
    }
}
