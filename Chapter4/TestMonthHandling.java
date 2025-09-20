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
    int userMonth2;
    long userMonthAdd;

    int userDay;
    int userDay2;

    int userYear;
    int userYear2;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Test Month Handling' Program.");

    System.out.println("Please enter the first month: ");
    userMonth = userInput.nextInt();
    System.out.println("Please enter the first date: ");
    userDay = userInput.nextInt();
    System.out.println("Please enter the first year: ");
    userYear = userInput.nextInt();

    LocalDate userDateFinal1 = LocalDate.of(userYear, userMonth, userDay);
    System.out.println("Here is the first date you entered: " + userDateFinal1);

    System.out.println("Now enter a number of months to add to the date: ");
    userMonthAdd = userInput.nextLong();
    System.out.println(userDateFinal1.plusMonths(userMonthAdd));


    System.out.println("Please enter the second month: ");
    userMonth2 = userInput.nextInt();
    System.out.println("Please enter the second date: ");
    userDay2 = userInput.nextInt();
    System.out.println("Please enter the second year: ");
    userYear2 = userInput.nextInt();

    LocalDate userDateFinal2 = LocalDate.of(userYear2, userMonth2, userDay2);
    System.out.println("Here is the second date you entered: " + userDateFinal2);

    System.out.println("Now enter a number of months to add to the second date: ");
    userMonthAdd = userInput.nextLong();
    System.out.println(userDateFinal2.plusMonths(userMonthAdd));

    userInput.close();
  }
}
