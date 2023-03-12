package org.example.inheritance;


public class Dog  extends Animal {

    int run = 500;
    double jump = 0.5;
    int swim = 10;

    @Override
    public void getRun(int value) {
        if(value == run){
            System.out.println("Песик побежал");

        } else
            System.out.println("Очень быстро");

    }


    public void getJump(double value) {
        if(value == jump){
            System.out.println("Песик прыгает");

        } else
            System.out.println("Высоко");

}

    @Override
    public void getSwim(int value) {
        if(value == swim){
            System.out.println("Песик плавает");

        } else
            System.out.println("Не могу ");
    }
}
