package ru.geekbrains;

public class Cat extends Animal {

     static int sumCat = 0;

     Cat(String name) {
        super(name);
        sumCat++;
    }

    Cat() {
        sumCat += 1;

    }


    @Override
    void run(int distanse) {

        if ((distanse>= 0) && (distanse) <= 200) {

            System.out.println( "The cat " + name + " run " +  distanse) ;

        }
        else System.out.println("The cat " + name + " cannot run as much");
    }

    @Override
    void swim(int distanse) {

        System.out.println("The cat " + name + " is not swim!");
    }
}
