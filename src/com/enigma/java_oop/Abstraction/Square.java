package com.enigma.java_oop.Abstraction;

public class Square extends Shape {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double getCircumference(){
        return 4*side;
    }

    @Override
    public Double getSurface(){
        return side*side;
    }
}