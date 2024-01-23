package com.enigma.java_oop;

public class Block extends Rectangle{
    private Double height;
    public Block(Double length,Double width, Double height){
        super(length, width);
        this.height=height;
    }

    @Override // <- anotasi : sebuah penanda/metadata
    public Double getSurface(){
        return 2* (length*width)+
                2 * (length*height)+
                2*(width*height);
    }
    public Double getCircumference(){
        return 4*(length+width+height);
    }

}
