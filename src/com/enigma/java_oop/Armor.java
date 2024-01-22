package com.enigma.java_oop;

public class Armor {
    private String type;
    private Integer defencePower;

    public Armor(String type, Integer defencePower){
        this.type=type;
        this.defencePower=defencePower;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setDefencePower(Integer defencePower){
        this.defencePower=defencePower;
    }
    public String getType(){
        return this.type;
    }
    public Integer getDefencePower(){
        return this.defencePower;
    }
    public void display(){
        System.out.println("Type Armor : " + this.type);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
