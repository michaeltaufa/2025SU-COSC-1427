/*
Program Name: Test Sandwich

Description:
Create an application named TestSandwich that prompts the user for 
data, instantiates one Sandwich object, and displays its values. 

Save the application as TestSandwich.java.

Created By: Michael Hikuleomtaufa 
Date Created: 2025-11-09
*/

import java.util.Scanner;

public class TestSandwich {
  public static void main(String[] args) {

    String userMainIngredient; 
    String userBreadType;
    double userSandwichPrice;

    Scanner userInput = new Scanner(System.in);

    System.out.println("This is the 'Test Sandwich' program. Let's build a sandwich.");

    System.out.println("First enter the main ingredient of the sandwich: ");
    userMainIngredient = userInput.nextLine();

    System.out.println("Next, what type of bread do you want for this sandwich: ");
    userBreadType = userInput.nextLine(); 

    System.out.println("Lastly, how much would the total price of this sandwich: ");
    userSandwichPrice = userInput.nextDouble();

    Sandwich userSandwich = new Sandwich(userMainIngredient, userBreadType, userSandwichPrice);

    userSandwich.displayMainIngredient();
    userSandwich.displayBreadType();
    userSandwich.displaySandwichPrice();
    userSandwich.displaySandwichDescription();

    userInput.close();
    System.out.println("Program is closed.");
  }
}
