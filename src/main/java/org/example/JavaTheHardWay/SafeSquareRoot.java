package org.example.JavaTheHardWay;

import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready = "YES!";

    System.out.println("Are you ready?!?");
    ready = keyboard.next();

    while (!ready.equals("YES!")) {
      System.out.println("I can't hear you!");
      ready = keyboard.next();
    }
    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while (x < 0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }

}
