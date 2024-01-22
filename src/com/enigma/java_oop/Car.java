package com.enigma.java_oop;

public class Car {
    //property/attribute
    private String color;
    private Integer wheel;
    private String name;
    private Integer fuel;

    public Car(String color, Integer wheel,String name){
        this.color=color;
        this.wheel=wheel;
        this.name=name;
        this.fuel=0;
    }
    public Car(String name, int wheel,String color){
        this.color=color;
        this.wheel=wheel;
        this.name=name;
        this.fuel=0;
    }
    public void fillFuel(Integer fuel){
        if (fuel > 30){
            System.out.println("penuh woi");

        }else{
            this.fuel+=fuel;
        }
    }
    //getter
    public Integer getFuel(){
        return fuel;
    }

    public void setFuel(Integer fuel){
        this.fuel=fuel;
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
                ", name=" + name + "fuel ="+ this.fuel+"}" ;
    }
}
