package org.example.cycles;

public class Main {
    public static void main(String[] args) {


        for(int i = 0; i < 6; i++,  System.out.println()) {
            for(int j = 0; j < 6; j++) {
                System.out.print("* ");

            }

        }
        System.out.println();

        int f = 4;
        for (int i = 0; i <=f; i++) {
            for (int j = 0; j <=f ; j++) {
                if (i == 0 || j == 0 || i == f || j == f) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int p = 5;
        for (int i = 1; i <=p ; i++) {
            for (int j = i; j <=p ; j++) {
                System.out.print("");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("0 ");

            }
            System.out.println();

        }
    }
}
