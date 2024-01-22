package com.enigma.java_oop;

public class Blade{
    private String type;
    private Integer damage;

    public Blade(String type, Integer damage){
        this.type=type;
        this.damage=damage;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setDamage(Integer damage){
        this.damage=damage;
    }
    public String getType(){
        return this.type;
    }
    public Integer getDamage(){
        return this.damage;
    }
    public void display(){
        System.out.println("Type Blade : " + this.type);
        System.out.println("Damge Blade : " + this.damage);
    }
}
