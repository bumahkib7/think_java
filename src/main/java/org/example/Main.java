package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;
        float cent = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");

        inch = in.nextInt();

        cm = inch * CM_PER_INCH;

        System.out.printf("%d in = %f cm \n ", inch, cm);

        inch = (int) (cm / CM_PER_INCH);

        System.out.printf("%f cm = %d in\n", cent, inch);

    }
}