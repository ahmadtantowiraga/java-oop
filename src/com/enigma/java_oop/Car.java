package com.enigma.java_oop;

public class Car {
    //property/attribute
    String ahmad="ahmad";
    static int aa;
    public String color;
    public Integer wheel;
    public String name;

    public Car(String color, Integer wheel,String name){
        this.color=color;
        this.wheel=wheel;
        this.name=name;
    }

    // method
    public void start(){
        System.out.println("Brumm");
    }
    public void stop(){
        System.out.println("ngittt");
    }
    public String print(){
        return "Car{" +
                "color=" + color +
                ", wheel=" + wheel +
                ", name=" + name + "}";
    }
}
