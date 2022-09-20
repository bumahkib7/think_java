package org.example.NON;

public class NewLine {
    public static void newLine(){
        System.out.println("1");
    }

    public static void threeLine(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("first line");
        threeLine();
        System.out.println("5th line");

    }
}
