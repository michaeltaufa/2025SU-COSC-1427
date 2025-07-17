/*
Program Name: Eggs 
Assignment:
Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 
for a dozen eggs or 45 cents for individual eggs that are not part of a dozen. 

Write a program that prompts a user for the number of eggs in the order and then 
display the amount owed with a full explanation. 

For example, typical output might be You ordered 27 eggs. 
That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85. 

Save the program as Eggs.java.

Program Description:

Created By: Michael Hikuleotmaufa
Date: 2025-07-16
*/

import  java.util.Scanner;

public class Eggs {
  public static void main(String[] args) {

    int dozenEggs;
    int looseEggs;
    
    final double priceDozenEggs = 3.25;
    final double priceLooseEggs = 0.45;

    double priceTotalEggs;

  
    Scanner inputDevice = new Scanner(System.in);

    // User Input:
    System.out.print("How many dozen of eggs would you like to order: ");
    dozenEggs = inputDevice.nextInt();

    System.out.print("How many loose eggs would you like to order: ");
    looseEggs = inputDevice.nextInt();

    // User Output:
    System.out.println("You orderd " + dozenEggs + " dozen of eggs at $ " + priceDozenEggs + " per dozen.");
    System.out.println("You orderd " + looseEggs + " loose eggs at $ " + priceLooseEggs + " per egg");

    priceTotalEggs = (dozenEggs * priceDozenEggs) + (looseEggs * priceLooseEggs);
    System.out.println("Your total is $ " + priceTotalEggs);
  }
}
