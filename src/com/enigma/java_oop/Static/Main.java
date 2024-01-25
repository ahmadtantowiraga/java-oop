package com.enigma.java_oop.Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        Constant.APPLICATION="Java Fundamental";
        System.out.println(Constant.APPLICATION);

        String inputan=Helper.inputString("Inputkan kata kata ");
        String name=Helper.inputString("Inputkan name anda");
    }

}
