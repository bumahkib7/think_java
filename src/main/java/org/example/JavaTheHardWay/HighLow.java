package org.example.JavaTheHardWay;

import java.util.Scanner;

public class HighLow {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(100*Math.random());
    System.out.println("I'm thinking of a number between 1-100.");
    System.out.println("Try to guess it!");
    System.out.print("> ");
    guess = keyboard.nextInt();

    while ( secret != guess ) {
      if ( guess < secret ) {
        System.out.print("Sorry, your guess is too low.\n");
        tryAgain();
        guess = keyboard.nextInt();
      }
      if ( guess > secret ) {
        System.out.print("Sorry, your guess is too high.\n");
        tryAgain();
        guess = keyboard.nextInt();
      }
    }

    System.out.println("You guessed it! What are the odds?!?");
  }

  public static void tryAgain(){
    System.out.println("Try again.");
    System.out.print("> ");
  }
}
