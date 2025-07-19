/*
Program Name: Chili To Go

Assignment:
The Huntington Boys and Girls Club is conducting a fundraiser by 
selling chili dinners to go. The price is $7 for an adult’s meal and 
$4 for a child’s meal. 

Write a program that accepts the number of each type of meal 
ordered, and display the total money collected for adults’ meals, children’s 
meals, and all meals. 

Save the program as ChiliToGo.java.

Program Description:

Created By: Michael Hikuleotmaufa
Date: 2025-07-18
*/

import  java.util.Scanner;

public class ChiliToGo {
  public static void main(String[] args) {

    int adultMealQuantity;
    int childMealQuantity;

    final double priceAdultMeal = 7.00;
    final double priceChildMeal = 4.00;

    double priceTotalAdult;
    double priceTotalChild;
    double priceTotal;

    Scanner inputDevice = new Scanner(System.in);

    System.out.println("Welcome to 'The Huntington Boys and Girls Club'!");
    // User input for meals:
    System.out.println("How many adults will be dining?");
    adultMealQuantity = inputDevice.nextInt();
    System.out.println("Lastly, how many children will be dining?");
    childMealQuantity = inputDevice.nextInt();

    // Calculate Total:
    priceTotalAdult = (adultMealQuantity * priceAdultMeal);
    priceTotalChild = (childMealQuantity * priceChildMeal);
    priceTotal = priceTotalAdult + priceTotalChild;

    // Output for cost:
    System.out.printf("The total for adults is %.2f\n", priceTotalAdult);
    System.out.printf("The total for children is %.2f\n", priceTotalChild);
    System.out.printf("The total is %.2f\n", priceTotal);
 }
}
