package com.enigma.java_oop.Abstraction;

public class Plane implements  Vehicle, FlayAble{
    @Override
    public void run() {
        System.out.println("Plane is Flying");
    }

    @Override
    public void stop() {
        System.out.println("Plane is lnading");
    }
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

}
