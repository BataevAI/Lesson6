package ru.geekbrains;

public class Animal {

    String name;
 public static int sumAnimal = 0;

     Animal(String name) {
        this.name = name;
         sumAnimal++;
    }

    Animal() {
        sumAnimal++;
    }

    void run (int distanse) {

        System.out.println(name + " running " + distanse + " metres.");

    }

    void swim (int distanse) {
        System.out.println(name + " swiming... " + distanse + " metres.") ;

    }


}
