package ru.geekbrains;



public class Lesson6 {


    public static void main(String[] args) {

// кот 1 - "Барсик"
Cat cat = new Cat("Barsik");
cat.swim(250);
cat.run(25);

//кот 2 - "Мурзик"
Cat cat2 = new Cat("Murzik");
cat2.run(30);
cat2.swim(5);

// кот 3 - безымянный
Cat cat3 = new Cat();


        System.out.println(" кол-во котов " + Cat.sumCat);

        // Собака 1

Dog dog = new Dog("Djuna");
dog.run(550);
dog.swim(15);

        // Собака 2

Dog dog2 = new Dog("Lessy");
dog2.run(400);
dog2.swim(5);

        // Собака 3

Dog dog3 = new Dog("German");

        // Собака 4, да пес ее знает как ее зовут

Dog dog4 = new Dog();
System.out.println(" кол-во собак " + Dog.sumDog);


       // Живтные 1 и 2

Animal an = new Animal("bird");
an.swim(25);

Animal an1 = new Animal("tiger");
an1.run(100);

                //Итого животных

        System.out.println(" кол-во животных: " + counter());

    }

    // счетчик всех живтных
 static int counter () {

        return Animal.sumAnimal;
}


}
