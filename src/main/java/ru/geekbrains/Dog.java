package ru.geekbrains;

public class Dog extends Animal{

     static int sumDog = 0;

     Dog(String name) {
        super(name);
        sumDog++;

    }

    public Dog() {
        sumDog++;
    }

    @Override
    void run(int distanse) {

        if ((distanse>= 0) && (distanse) <= 500) {

            System.out.println( "The dog " + name + " run " +  distanse) ;

        }
        else System.out.println("The dog " + name + " cannot run as much");
    }

    @Override
    void swim(int distanse) {


        if ((distanse>= 0) && (distanse) <= 10) {

            System.out.println("The dog " + name + " swimming " + distanse + " metres");

        }

        else if (distanse < 0) { System.out.println("wrong!");}
        else System.out.println("The dog " + name + " tired!");



    }


}
