package org.example;

import java.util.Scanner;

public class Logarithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number: ");



        if(!sc.hasNextDouble()){
            String word = sc.nextLine();
            System.err.println(word + " is not a number");
            return;
        }

        double userInput = sc.nextDouble();
        if(userInput > 0 || userInput < 10){
            double result = Math.log(userInput);
            System.out.println("positive single digit number");
            System.out.println("the log is " + userInput);
        } else {
            System.out.println("log undefined");
        }



    }
}
