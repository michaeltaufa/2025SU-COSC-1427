/*
Program Name: Dollars 

Assignment
Write a program that allows the user to enter an integer number 
of dollars and calculates and displays the conversion into currency 
denominations—20s, 10s, 5s, and 1s. 

Save the program as Dollars.java.

Program Description:

Created By: Michael Hikuleotmaufa
Date: 2025-07-18
*/

import  java.util.Scanner;

public class Dollars {
  public static void main(String[] args) {

    int userNumberInput;
    int twentyDollars;
    int tenDollars;
    int fiveDollars;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Dollars Conversion' Program.");
    System.out.println("Please enter a number of dollars to begin conversion: ");
    userNumberInput = userInput.nextInt();

    twentyDollars = userNumberInput / 20;
    tenDollars = userNumberInput / 10;
    fiveDollars = userNumberInput / 5;

    System.out.println("\nResult:\nYou entered " + userNumberInput + " dollars.");
    System.out.println("\nConversion:");
    System.out.println("Which converts to " + fiveDollars + " '5 dollar bills'");
    System.out.println("Which can also convert to " + tenDollars + " '10 dollar bills'");
    System.out.println("Or can convert into " + twentyDollars + " '20 dollar bills'");
  }
}
