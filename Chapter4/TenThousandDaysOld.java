/*
Program Name: Ten Thousand Days Old 

Write an application that prompts a user for the user’s month, day, and year 
of birth and uses the LocalDate class to compute the day on which the user 
will become (or became) 10,000 days old. 

Save the application as TenThousandDaysOld.java.

Created By: Michael Hikuleotmaufa
Date: 2025-09-10
*/

import java.util.Scanner;
import java.time.LocalDate;

public class TenThousandDaysOld {
  public static void main(String[] args) {

    int userBirthMonth;
    int userBirthDayOfMonth;
    int userBirthYear;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the '10,000 days old' program.");


    System.out.println("Enter the month you was born: ");
    userBirthMonth = userInput.nextInt();

    System.out.println("Enter the date of the month you was born: ");
    userBirthDayOfMonth = userInput.nextInt();

    System.out.println("Enter the year you was born: ");
    userBirthYear = userInput.nextInt();

    LocalDate userFullBirthdate = LocalDate.of(userBirthYear, userBirthMonth, userBirthDayOfMonth);
    System.out.println("Your birthday is " + userFullBirthdate);
    System.out.println("You would become 10,000 days old at " + userFullBirthdate.plusDays(10000));

    userInput.close();
    System.out.println("Program is closed.");
  }
}
