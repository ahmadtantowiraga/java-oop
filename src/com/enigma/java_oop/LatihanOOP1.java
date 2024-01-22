package com.enigma.java_oop;

import java.nio.file.Watchable;

class Player{
    String name;
    double health;
    int level;
    Weapon weapon;
    Armor1 armor;
    Player(String name, double health){
        this.name=name;
        this.health=health;
    }
    void equipWeapon(Weapon weapon){
        this.weapon=weapon;
    }
}

class Weapon{
    double attackPower;
    String name;
    Weapon(String name, double attackPower){
        this.attackPower=attackPower;
        this.name=name;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , power : "+this.attackPower);
    }
}
class Armor1{
    double defencePower;
    Armor1(double defencePower){
        this.defencePower=defencePower;
    }
}



public class LatihanOOP1 {
    public static void main(String[] args) {
        Player player1;
        player1=new Player("ucup",100);

        Weapon pedang =new Weapon("pedang",15);

        Armor1 bajuBesi=new Armor1(10);
        player1.equipWeapon(pedang);
        player1.weapon.display();
    }
}
