/*
Program Name: User Guess Number
Description:
This program is desgined to conduct the following:
  - User will input name to make personal
  - Create a random number
  - User will input a number to guess the random number
  - Computer will compare the number if it matches 
  - If number matches, user will win. If number does not match, user will lose.
Created By: Michael Hikuleomtaufa
Date: 2025-08-08
 */


import java.util.Scanner;

public class userGuessNumber {
  public static void main(String[] args) {

    // Declare all data varaibles needed for the program
    String username;
    int randomNumber;
    int userNumber;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Guess The Number' program.\nTo start, enter your name: ");
    username = userInput.nextLine();

    System.out.println("Hello " + username + ", now guess a number between 1-10.");
    userNumber = userInput.nextInt();
    randomNumber = (int)(Math.random() * 11);

    if (userNumber == randomNumber){
      System.out.println("Congratulations! You guess the number correctly!");
      System.out.println("\nResults:");
      System.out.println("The number you selected is " + userNumber);
      System.out.println("The random number is " + randomNumber);

    } else {
      System.out.println("I'm sorry, you guess the number incorrectly!");
      System.out.println("\nResults:");
      System.out.println("The number you selected is " + userNumber);
      System.out.println("The random number is " + randomNumber);
    }

    userInput.close();
  }
}
