package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;
        int number = rand.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);

        //prompt user input
        System.out.println("im thinking of a number between 1 and 100");
        System.out.println("can u guess what it is? ");
        System.out.println("Enter your number");
        // use scanner to enter number
        num = in.nextInt();

        //validations
        if(num > 100){

            System.out.printf("number : %d is not  of what i was thinking about", num);
            System.exit(1);
        }

        //Print output
        System.out.println("you guess is: " + num);
        //Print out the random number
        System.out.println("The number i was thinking of is: " + number);
        //subtract your guess with the random number
        int subtraction = number - num;

        System.out.printf("you were off by %d", subtraction);
    }
}
