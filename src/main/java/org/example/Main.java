package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      final int feet = 12;
      final double inches = 1;
      int inchesEntered;
      int inchesToFeet;
      int inchesRemaining;

        Scanner input = new Scanner(System.in);
        System.out.println("There are " + feet + " inches in a foot");
        System.out.println("Enter the number of inches you would like converting into feet >>");
        inchesEntered = input.nextInt();
        System.out.println("You entered " + inchesEntered + " inches to be converted");
        inchesToFeet = inchesEntered / feet;
        inchesRemaining = inchesEntered % feet;
        System.out.println(inchesEntered + " inches is equal to " + inchesToFeet + " feet and " + inchesRemaining + " inches");


    }
}