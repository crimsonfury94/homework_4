package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Task 2
        int friday = 6;
        do {
            System.out.println("Today is friday " + friday + " th. Need prepare report!");
            friday = friday + 7;
        } while (friday < 31);

        // Task 3

    }
}
