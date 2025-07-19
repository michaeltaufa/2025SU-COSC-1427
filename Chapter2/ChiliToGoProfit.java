/*
Program Name: Chili To Go Profit

Assignment:
In the ChiliToGo program, the costs to produce an adult’s meal 
and a child’s meal are $4.35 and $3.10, respectively. 

Modify the ChiliToGo program to display the total profit for each type of meal 
as well as the grand total profit. 

Save the program as ChiliToGoProfit.java.

Program Description:

Created By: Michael Hikuleotmaufa
Date: 2025-07-18
*/

import  java.util.Scanner;

public class ChiliToGoProfit {
  public static void main(String[] args) {

    int adultMealQuantity;
    int childMealQuantity;

    final double priceAdultMeal = 7.00;
    final double priceChildMeal = 4.00;

    final double costToProduceAdult = 4.35;
    final double costToProduceChild = 3.10;

    double profitRevenueAdult;
    double profitRevenueChild;
    double profitRevenueTotal;

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

    // Calculate Revenue:
    profitRevenueAdult = (priceTotalAdult - (adultMealQuantity * costToProduceAdult));
    profitRevenueChild = (priceTotalChild - (childMealQuantity * costToProduceChild));
    profitRevenueTotal = (profitRevenueAdult + profitRevenueChild);

    // Output for cost:
    System.out.printf("The total for adults is %.2f\n", priceTotalAdult);
    System.out.printf("The total for children is %.2f\n", priceTotalChild);
    System.out.printf("The total is %.2f\n", priceTotal);


    System.out.printf("The revenue for adults is %.2f\n", profitRevenueAdult);
    System.out.printf("The revenue for children is %.2f\n", profitRevenueChild);
    System.out.printf("The total revenue is %.2f\n", profitRevenueTotal);
  }
}
