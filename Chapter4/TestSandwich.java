/*
Program Name: Test Sandwich 

Description:
Create an application named TestSandwich that prompts the user for data, instantiates one 
Sandwich object, and displays its values. 


Save the application as TestSandwich.java

Created By: Michael Hikuleotmaufa
Date: 2025-09-23
*/

import java.util.Scanner;

public class TestSandwich {
  public static void main(String[] args) {

    String userMainIngredient;
    String userBread;
    double userPrice;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Create Your Sandwich Program'. ");

    System.out.println("Please what type what type of bread you would like for your sandwich: ");
    userBread = userInput.nextLine();

    System.out.println("Please enter the main ingredient for your sandwich: ");
    userMainIngredient = userInput.nextLine();

    System.out.println("Lastly, how much would this sandwich cost: ");
    userPrice = userInput.nextDouble();

    Sandwich userSandwich = new Sandwich(userMainIngredient, userBread, userPrice);

    userSandwich.displayMainIngredient();
    userSandwich.displayPrice();

    userInput.close(); 
  }
}
