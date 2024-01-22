package com.enigma.java_oop;

public class Warrior {
    private String name;
    private Integer level;

    public Warrior(String name, Integer level){
        this.name=name;
        this.level=level;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLevel(Integer level){
        this.level=level;
    }
    public String getName(){
        return this.name;
    }
    public Integer getLevel(){
        return this.level;
    }
    public void display(){
        System.out.println("Nama Warrior : " + this.name);
        System.out.println("Level Warrior : " + this.level);
    }
}
