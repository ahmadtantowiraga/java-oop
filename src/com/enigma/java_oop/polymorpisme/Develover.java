package com.enigma.java_oop.polymorpisme;

public class Develover extends Employee{
    public Develover(String name) {
        super(name);
    }
    @Override
    public void sayHello(String name){
        System.out.println("Hello "+name + "' Nama saya Develover "+this.name);
    }
}
