package org.example.JavaTheHardWay;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RecieptRevisitedException {
  public static void main(String[] args) {
    PrintWriter fileout;
    try {
      fileout = new PrintWriter("receipt.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
      System.out.println("Maybe the file exists and is read-only?");
      fileout = null;
      e.printStackTrace();
      System.exit(1);
    }

    fileout.println("+------------------------+");
    fileout.println("|                        |");
    fileout.println("|      CORNER STORE      |");
    fileout.println("|                        |");
    fileout.println("| 2015-03-29  04:38PM    |");
    fileout.println("|                        |");
    fileout.println("| Gallons:       10.870  |");
    fileout.println("| Price/gallon: $ 2.089  |");
    fileout.println("|                        |");
    fileout.println("| Fuel total:  $ 22.71   |");
    fileout.println("|                        |");
    fileout.println("+------------------------+");
  }


}
