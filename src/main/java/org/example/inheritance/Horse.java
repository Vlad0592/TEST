package org.example.inheritance;

public class Horse extends Animal {

    int run = 1500;
    int jump = 3;
    int swim = 100;


    @Override
    public void getRun(int value) {
        if (value == run) {
            System.out.println("Лошадка побежала");

        } else
            System.out.println("Очень быстро");

    }

    @Override
    public void getJump(int value) {
        if (value == jump) {
            System.out.println("Лошадка прыгает");

        } else
            System.out.println("Не могу");

    }
    @Override
    public void getSwim(int value) {
        if(value == swim){
            System.out.println("Лошадка  плавает");

        } else
            System.out.println("Не могу ");
    }
}



