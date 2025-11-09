/*
Program Name: Percentage 

Description:
Create an application named Percentages whose main() method holds two double 
variables, and prompt the user for values. 

Pass both variables to a method named computePercent() that displays the two values 
and the value of the first number as a percentage of the second one. 

For example, if the numbers are 2.0 and 5.0, the method should display a statement 
similar to 2.0 is 40 percent of 5.0. Then call the method a second time, passing the 
values in reverse order. Save the application as Percentages.java.

Date Created: 2025-11-09

Created By: Michael Hikuleomtaufa
*/

import java.util.Scanner;

public class Percentages {
  public static void main(String[] args) {

    double user_double1;
    double user_double2;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter your first double: ");
    user_double1 = userInput.nextDouble();

    System.out.println("Enter your second double: ");
    user_double2 = userInput.nextDouble();

    computerPercentage(user_double1, user_double2);
    computerPercentageReverse(user_double1, user_double2);

    userInput.close(); 
    System.out.println("Program is closed.");
  }

  // Methods:
  public static void computerPercentage(double number1, double number2){
    double totalPercent = (number1/number2)*100.00;
    System.out.println("Output: " + totalPercent + "%");
  }

  public static void computerPercentageReverse(double number1, double number2){
    double totalPercent = (number2/number1)*100.00;
    System.out.println("Reverse Output: " + totalPercent + "%");
  }
}
