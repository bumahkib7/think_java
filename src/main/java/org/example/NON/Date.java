package org.example.NON;

public class Date {

    public static void displayDateInAmericanFormat(String day, int date, String month, int year){
        System.out.println("American Format: " + day + ", " + month + " " + date+ "th, " + year );

    }

    public static void displayDateInEuropeanFormat(String day, int date, String month, int year){
        System.out.println("European Format: " + day + " " + date + " " + month + " "  + year );
    }

    public static void main(String[] args) {

        String day;
        int date, year;
        String month;

        //assign
        day = "Monday";
        date = 19;
        month = "September";
        year = 2022;

        //Display
        displayDateInAmericanFormat(day,date,month,year);
        displayDateInEuropeanFormat(day,date, month,year);


    }
}
