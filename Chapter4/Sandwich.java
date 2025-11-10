/*
Program Name: Class - Sandwich 

Description:
Create a class named Sandwich. 

Data fields include a String for the main ingredient (such as tuna), a String 
for bread type (such as wheat), and a double for price (such as 4.99). 

Include methods to get and set values for each of these fields. 

Save the class as Sandwich.java.

Created By: Michael Hikuleomtaufa 
Date Created: 2025-11-09
*/

public class Sandwich {

  // Attributes:
  String mainIngedient;
  String breadType;
  double sandwichPrice;

  // Constructor:
  public Sandwich (String mainIngedient, String breadType, double sandwichPrice){
    this.mainIngedient = mainIngedient;
    this.breadType = breadType;
    this.sandwichPrice = sandwichPrice;
  }

  // Methods:
  public void displayMainIngredient(){
    System.out.println("The main ingredient of this sandwich is " + mainIngedient);
  }

  public void displayBreadType(){
      System.out.println("The bread type of this sandwich is " + breadType);
  }

  public void displaySandwichPrice(){
    System.out.println("The total price of this sandwich is $" + sandwichPrice);
  }

  public static void main(String[] args) {
  }
}
