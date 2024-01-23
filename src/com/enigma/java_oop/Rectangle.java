package com.enigma.java_oop;
/*
*
* Konsep dasar inheritance
* 1. Superclass (parent class):Kelas yang atribute dan method nanti akan diwariskan
* 2. Subclass(child class) : Kelas yang mewarisi attribute dan methode dari superclass
* 3. Override :Subclaas dapat merubah implementasi dari method yang sudah diwariskan
* 4. exteds : keyword digunakan di jaba untuk mewariskan kelas
*5. protected : hanya bisa diakses oleh turunanya dan kelas itu sendri, kecuali beda package
 */
public class Rectangle {
    protected Double length;
    protected  Double width;
    public Rectangle(Double length, Double width){
        this.length=length;
        this.width=width;
    }
    public Double getSurface(){
        return length * width;
    }
    public Double getCircumference(){
        return 2*(length+width);
    }
    public void display(Double display){
        System.out.println(display);
    }
}
