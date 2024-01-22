package com.enigma.java_oop;

public class Main {
    public static void main(String[] args) {
//    Car ayla=new Car("yellow",4,"ayla");
//    ayla.fillFuel(10);
//    ayla.fillFuel(40);
//    ayla.start();
//    ayla.setFuel(17);
//    int a= ayla.getFuel();
//        System.out.println(a);
//        System.out.println(ayla.print());

        Warrior player1=new Warrior("ahmad",7);
        player1.display();

        System.out.println();
        player1.setLevel(10);
        player1.setName("ujang");
        player1.display();
    }
}
