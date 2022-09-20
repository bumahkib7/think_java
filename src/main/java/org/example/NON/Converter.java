package org.example.NON;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int INCH_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        //prompt the user to get the value
        System.out.println("How many Cm would you like to convert? ");
        cm = in.nextDouble();

        inches = (int) (cm / CM_PER_INCH);
        feet = inches / INCH_PER_FOOT;
        remainder = inches % INCH_PER_FOOT;
        System.out.printf("%.2f cm = %,d ft, %,d inches\n", cm, feet, remainder);
    }

}

class TempConverter {

    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);

        //prompting for user input
        System.out.println("Enter Temperature in celsius");
        celsius = in.nextDouble();
        fahrenheit =  celsius * 9/5 + 32;

        //formatting
        System.out.printf("%.2f C = %.2f F \n", celsius, fahrenheit);


    }



}


class Seconds_in_Hours_converter{

    public static void main(String[] args) {

            int seconds;
            int hours;
            int minutes;
            int remainder;
            Scanner in = new Scanner(System.in);

            //prompting for user input
            System.out.println("Enter seconds");
            seconds = in.nextInt();

            //calculating
            hours = seconds / 3600;
            minutes = seconds / 60;
            remainder = seconds % 60;

            if(minutes > 60){
                minutes = minutes % 60;
            }

            //formatting
            System.out.printf("%d seconds = %d hours, %d minutes, %d seconds\n", seconds, hours, minutes, remainder);

        }
}


