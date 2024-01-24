package com.enigma.java_oop.polymorpisme;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }
    @Override
    public void sayHello(String name){
        System.out.println(("Jello "+ name + " , Nama saya Manager "+ this.name));
    }
}
