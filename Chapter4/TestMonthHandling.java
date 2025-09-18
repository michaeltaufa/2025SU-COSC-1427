/*
Program Name: Test Month Handling 

Assignment:
Write a program that declares two LocalDate objects and prompts the user for values.

Display output that demonstrates the dates displayed when one, two, and three months 
are added to each of the objects. 

(When you test the program, be sure to try some date late in the month so you 
can observe what happens when a following month does not have as many days.) 

Save the application as TestMonthHandling.java.

Created By: Michael Hikuleotmaufa
Date: 2025-09-07
*/

import java.time.LocalDate;
import java.util.Scanner;

public class TestMonthHandling {

  public static void main(String[] args) {

    int userMonth;
    int userDate;
    int userYear;

    int userMonth1;
    int userDate1;
    int userYear1;


    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter the first month: ");
    userMonth = userInput.nextInt();

    System.out.println("Please enter the first date: ");
    userDate = userInput.nextInt();

    System.out.println("Please enter the first year: ");
    userYear = userInput.nextInt();

    LocalDate userDateFinal1 = LocalDate.of(userYear, userMonth, userDate);
    System.out.println("First Date: " + userDateFinal1);




    System.out.println("Please enter the second month: ");
    userMonth1 = userInput.nextInt();

    System.out.println("Please enter the second date: ");
    userDate1 = userInput.nextInt();

    System.out.println("Please enter the second year: ");
    userYear1 = userInput.nextInt();

    LocalDate userDateFinal2 = LocalDate.of(userYear1, userMonth1, userDate1);
    System.out.println("Second Date: " + userDateFinal2);
    




    userInput.close();
  }
}
