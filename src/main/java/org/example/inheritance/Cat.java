package org.example.inheritance;


public class Cat extends Animal {
    int run = 200;
    int jump = 2;

    @Override
    public void getRun(int value) {
        if(value == run){
            System.out.println("Котик пробежал");

        } else
            System.out.println("Очень быстро");

    }


    @Override
    public void getJump(int value) {
        if(value == jump){
            System.out.println("Котик прыгает");

        } else
            System.out.println("Высоко");

    }
}
