package com.enigma.java_oop.object_interaction;

public class Room {
    private Lamp roomLamp;
    public Room(Lamp roomLamp){
        this.roomLamp=roomLamp;
    }

    public void switchLight(){
        if (roomLamp.getIsOn()){
            roomLamp.turnOff();
        }else{
            roomLamp.turnOn();
        }
    }
}
