/*
Program Name: Sandwich 

Description:
Create a class named Sandwich. 

Data fields include a String for the main ingredient (such as tuna), a 
String for bread type (such as wheat), and a double for price (such as 4.99). 

Include methods to get and set values for each of these fields. 

Save the class as Sandwich.java.

Created By: Michael Hikuleotmaufa
Date: 2025-09-23
*/


public class Sandwich {

  // Attributes:
  private String mainIngredient;
  private String breadType;
  private double price;

  // Constructor:
  public Sandwich (String mainIngredient, String breadType, double price){
    this.mainIngredient = mainIngredient;
    this.breadType = breadType;
    this.price = price;
  }

  // Methods:
  public void displayBread(){
    System.out.println("Bread: " + breadType);
  }

  public void displayMainIngredient(){
    System.out.println("Main Ingredient: " + mainIngredient);
  }

  public void displayPrice(){
    System.out.printf("Price $%.2f", price);
  }

  public void displaySandwich(){
    System.out.println("You have a " + mainIngredient + " with " + breadType + " bread sandwich.");
  }
 public static void main(String[] args) {
 } 
}

