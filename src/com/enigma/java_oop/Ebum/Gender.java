package com.enigma.java_oop.Ebum;

public enum Gender {
    MALE("Laki-lki"),
    FEMALE("PEREMPUAN");
    private String decription;
    private String aaa;
    Gender(String description){
        this.decription=description;
    }

    public String getFescription(){
        return decription;
    }
    public static String tes(){
        return "test ku";
    }
}
