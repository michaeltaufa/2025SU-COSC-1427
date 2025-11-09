/*
Program Name: Numbers Demo

Description:
Create an application named NumbersDemo whose main() method holds 
two integer variables. 

Prompt the user for values for the variables. In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), 
and displayNumberSquared(). 

Create each method to perform the task its name implies. Save the application as NumbersDemo.java.

Date Created: 2025-11-09

Created By: Michael Hikuleomtaufa
*/

import java.util.Scanner;

public class NumbersDemo {
  public static void main(String[] args) {

    String username;

    int user_interger1;
    int user_interger2;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter your name: ");
    username = userInput.nextLine();

    System.out.println("Let's add 5 to your number.\nPlease enter a number: ");
    user_interger1 = userInput.nextInt();
    displayNumberPlusFive(user_interger1);

    System.out.println("Awesome. Let's try and square a number. Please enter another number: ");
    user_interger2 = userInput.nextInt();
    displaySquaredNumber(user_interger2);

    userInput.close();
    System.out.println("Program closed.");
  }

  // IMPORTANT NOTE:
    // Static Methods:
      // Belong to the class, NOT THE Object
      // These methods can be called in the class
      // EXMAPLE: addNumbers();


    // Non-Static Methods:
      // Belong to the Object/ Instace, NOT THE CLASS
      // These methods will need to be class and ref with the object/
      // instance. EXMAPLE: obeject1.addNumbers();


  // Methods:
  public static void displayTwiceTheNumber(int number){
    System.out.println("Displaying number twice: ");
    System.out.println(number);
    System.out.println(number);
  }

  public static int displayNumberPlusFive(int number){
    int totalNumber = number + 5;
    System.out.println("We are adding 5 with " + number);
    System.out.println("Total: " + totalNumber);

    return totalNumber;
  }

  public static void displaySquaredNumber(int number){
    int totalNumber = number * number;
    System.out.println("Total Squared Number: " + totalNumber);
  }
}
