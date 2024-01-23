package com.enigma.java_oop;

public class Main {
    public static void main(String[] args) {
    Block block=new Block(4.0, 2.0, 3.0);
    block.display(block.getCircumference());
    block.display(block.getSurface());

    Cow c=new Cow();
    c.breathe();
    }
}
