package com.enigma.java_oop.Abstraction;

public class Motorcycle implements Vehicle{



    public void run() {
        System.out.println("bergerak");
    }

    @Override
    public void stop() {
        System.out.println("Berhenti");
    }
}
