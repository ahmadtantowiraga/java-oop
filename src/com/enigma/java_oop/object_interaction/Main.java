package com.enigma.java_oop.object_interaction;
import com.enigma.java_oop.Animal;
import com.enigma.java_oop.Mammal;
import com.enigma.java_oop.polymorpisme.Develover;
import com.enigma.java_oop.polymorpisme.Employee;
import com.enigma.java_oop.polymorpisme.Manager;

public class Main {


    public static void main(String[] args) {
//        Animal animal=new Mammal();
//         Mammal mammals2=(Mammal) animal;
//
//        Mammal mammal2=new Mammal();
//        Animal animal2=(Animal) mammal2;
        Employee employee=new Employee("Alindo");
        employee.sayHello("budi");

//        Manager emon=(Manager) employee;
//        emon.sayHello("budi");

        employee=new Manager("Arahmano");
        employee.sayHello("Alvindo");

        employee=new Develover("Irfan");
        employee.sayHello("Rahman");


    }
}
