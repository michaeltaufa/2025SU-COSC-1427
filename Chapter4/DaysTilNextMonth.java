/*
Program Name: Days Til Next Month Program 

Assignment:
The LocalDate class includes an instance method named 
lengthOfMonth() that returns the number of days in the month. 

Write an application that allows the user to enter a month, day, and year 
and uses methods in the LocalDate class to calculate how many days are 
left until the first day of next month. 

For example, if the user enters 6 and 28 for the month and the day, the 
output should be There are 3 days until JULY starts. 

Save the file as DaysTilNextMonth.java.

Created By: Michael Hikuleotmaufa
Date: 2025-09-17
*/

import java.util.Scanner;
import java.time.LocalDate;

public class DaysTilNextMonth {
  public static void main(String[] args) {

    int userMonth;
    int userDay;
    int userYear;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter the month: ");
    userMonth = userInput.nextInt();

    System.out.println("Please enter the day: ");
    userDay = userInput.nextInt();

    System.out.println("Please enter the year: ");
    userYear = userInput.nextInt();

    LocalDate userDate = LocalDate.of(userYear, userMonth, userDay);
    System.out.println("Result: " + userDate);




    userInput.close();
  }
}
