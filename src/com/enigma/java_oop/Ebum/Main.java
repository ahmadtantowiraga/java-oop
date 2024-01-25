package com.enigma.java_oop.Ebum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Gender male=Gender.MALE;
//        System.out.println(male);
//        System.out.println(Gender.MALE);
//
//        System.out.println(Arrays.toString(Gender.values()));
//
//        System.out.println(Gender.MALE.getFescription());
//        System.out.println(Gender.tes());
//        te();
//    }
//    public static void te(){
//        System.out.println(Gender.tes());

        Direction nort=Direction.valueOf("NORTH");
        System.out.println(nort);
        System.out.println(nort.ordinal());
        System.out.println(nort.name());
        System.out.println(Direction.values()[0]);
    }
}
