package com.enigma.java_oop.polymorpisme;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
    public void sayHello(String name){
        System.out.println("hello "+name+" ' Nama saya Laryawan "+this.name);
    }
}
