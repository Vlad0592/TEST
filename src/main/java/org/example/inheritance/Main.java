package org.example.inheritance;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.getRun(200);
        cat.getJump(2);

        Dog dog = new Dog();
        dog.getRun(500);
        dog.getJump(0.5);
        dog.getSwim(10);

        Horse horse = new Horse();
        horse.getRun(1500);
        horse.getJump(3);
        horse.getSwim(100);


        Bird bird = new Bird();
        bird.getRun(5);
        bird.getJump(0.2);






    }
}