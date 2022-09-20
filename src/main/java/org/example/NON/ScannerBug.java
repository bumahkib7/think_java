package org.example.NON;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = in.nextLine();

        System.out.println("what is your age? ");
        int age = in.nextInt();

        System.out.printf("hello %s, age %d\n", name, age);
    }


}

class ScannerBug2 {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("what is your age?");
        age = in.nextInt();
        in.nextLine();
        System.out.println("what is your name? ");
        name = in.nextLine();
        System.out.printf("hello %s, age %d\n", name, age);


    }
}