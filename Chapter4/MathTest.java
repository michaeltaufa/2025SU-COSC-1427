/*
Program Name: Math Test 

Assignment:
Write a Java application that prompts the user for an int and a double and 
then uses Math class methods to display each of the following:

The square root of the int

A random number between 0 and the int (Hint: The Math.random() method 
returns a value between 0 and 1. For example, if the int is 10, you want a 
number that is 10 times larger than the value returned.)

The value of the floor, ceiling, and round of the double

The larger and the smaller of the int and the double

Save the application as MathTest.java.

Created By: Michael Hikuleotmaufa

Date: 2025-07-27
*/

import java.util.Scanner;

public class MathTest {

  public static void main(String[] args) {

    int userInt;
    double userRandomInt;
    double userDouble;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Math Test Program'.\nFirst, enter an integer: ");
    userInt = userInput.nextInt();

    System.out.println("The square root of " + userInt + " is " + Math.sqrt(userInt));

    userRandomInt = (Math.random() * userInt);
    System.out.println("The random number between 0 and " + userInt + " is " + Math.round(userRandomInt));
    
    System.out.println("Next, enter a decimal: ");
    userDouble = userInput.nextDouble();
    System.out.println(userDouble + "'s ceiling is " + Math.ceil(userDouble));
    System.out.println(userDouble + "'s floor is " + Math.floor(userDouble));
    System.out.println(userDouble + " is rounded to " + Math.round(userDouble));

    if (userInt > userDouble){
      System.out.println(userInt + " is the larger number and " + userDouble + " is the smaller number.");
    }
    else if (userDouble > userInt){
      System.out.println(userDouble + " is the larger number and " + userInt + " is the smaller number.");
    }
    else {
      System.out.println("It appears that the int " + userInt + " and the double " + userDouble + " is equal to each other.");
    }
    

    userInput.close();
    System.out.println("Program is closed.");
  }
}
