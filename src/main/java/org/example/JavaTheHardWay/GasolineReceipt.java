package org.example.JavaTheHardWay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class GasolineReceipt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LocalDate date = LocalDate.now();
    DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    String dateString = dateFormat.format(new Date());
    double gallons = sc.nextDouble();
    double pricePerGallon = 2.089;
    float fuelTotal = (float) (gallons * pricePerGallon);


    System.out.println("+----------------------------+");
    System.out.println("|                            |");
    System.out.println("|       CORNER STORE         |");
    System.out.println("|                            |");
    System.out.printf("|   %s, %s     |\n", date, dateString);
    System.out.println("|                            |");
    System.out.printf("| Gallons: %s              |\n", gallons);
    System.out.printf("| Price/gallon: $ %s      |\n", pricePerGallon);
    System.out.println("|                            |");
    System.out.printf("| Fuel total:  $ %s      |\n", fuelTotal);
    System.out.println("|                            |");
    System.out.println("+----------------------------+");
  }
}
