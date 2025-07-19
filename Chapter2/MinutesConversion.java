/*
Program Name: Minutes Conversion 

Assignment:
Write a program that accepts an integer number of minutes 
from a user and converts it both to hours and days. 
For example, 6,000 minutes equals 100 hours and equals 4.167 days. 
Save the program as MinutesConversion.java.

Program Description:

Created By: Michael Hikuleotmaufa
Date: 2025-07-18
*/

import  java.util.Scanner;

public class MinutesConversion {
  public static void main(String[] args) {

    int userInputMinutes;

    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Welcome to the 'Minutes Conversion' Program.");
    System.out.println("Enter a number of minutes to convert into hours and days: ");
    userInputMinutes = userInput.nextInt();

    int hours = userInputMinutes / 60;
    int remainingMinutes = userInputMinutes % 60;

    // IMPORTANT! 
    // When dividing floats/ doubles, make sure to use float/ double to conduct equation
    double days = userInputMinutes / 1440.0;

    System.out.println("\nConversion:");
    System.out.println(userInputMinutes + " minutes is equal to:");
    System.out.println(hours + " hours and " + remainingMinutes + " minutes or ...");
    System.out.printf("%.3f days", days);
  }
}
