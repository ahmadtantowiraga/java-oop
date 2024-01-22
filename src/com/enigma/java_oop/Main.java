package com.enigma.java_oop;

public class Main {
    public static void main(String[] args) {
        //object adalah representasi hasil dari sebuah blueprint
        //membuat object itu sama kaya variabale
        //membuat object disebut juga dengan instance
        // non primitive//class
//        Car bmw = new Car();//intance class
//        System.out.println(bmw.color);
//        System.out.println(bmw.name);
//        System.out.println(bmw.wheel);
//
//        //cara 1. reassiegn
//        Car supra=new Car();
//        supra.color="red";
//        supra.name="toyota supra";
//        supra.wheel=20;
//        int a=supra.wheel;
//
//
//        System.out.println(supra.color);
//        System.out.println(supra.name);
//        System.out.println(supra.wheel);
//
//        supra.start();
//        supra.stop();

        //cara 2 - constructor
        //sebuah method yang nmaanya sma dengan class
        // constructor akan dipanggil pertama kali objec itu di buat
//        Car bmw = new Car("merah",13,"bmw");
//        System.out.println(bmw.color);
//        System.out.println(bmw.name);
//        System.out.println(bmw.wheel);
//        System.out.println(bmw.print());

        Car aaaa=new Car("yellow",12,"apasih");
        Car bbb=new Car("yellow",12,"apasih");
        bbb.ahmad="wira";
        System.out.println(bbb.ahmad);
        System.out.println(aaaa.color);
        System.out.println(aaaa.ahmad);



        //4 pilar oop (Encapsulation, Inheritance, Polymorphism,Abstaction)

    }
}
