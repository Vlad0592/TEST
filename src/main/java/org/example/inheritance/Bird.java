package org.example.inheritance;


public class Bird extends Animal{
    private int run = 5;
    private double jump  = 0.2;

    @Override
    public void getRun(int value) {
        if (value == run) {
            System.out.println("Птица  побежала");

        } else
            System.out.println("Очень быстро");

    }


    public void getJump(double value) {
        if (value == jump) {
            System.out.println("Птица  прыгает");

        } else
            System.out.println("Не могу");

    }


}
