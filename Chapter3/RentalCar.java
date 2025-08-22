/*
Program: Rental Car
Description:
  This program will focus on grabbing the user's input information of the following:
  - Name
  - Car Model and Make
  - Provide a pre-list of car that is in stock

  Next, the argument will be passed into a method to do the following:
  - Check if car is in the inventory
  - Conditional statment:
    - Print message the car is in stock
    - Print message the car is not in stock

Created by: Michael Hikuleomtaufa 
Date: 2025-08-20
*/

import java.util.Scanner;

public class RentalCar {
  public static void main(String[] args) {

    String username;
    String rental_carMake;
    String rental_carModel;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Rental Car' program. Please enter your name: ");
    username = userInput.nextLine();

    System.out.println("Welcome " + username + "!\nNow type and enter the make of the vehicle you would like to rent: ");
    rental_carMake = userInput.nextLine();

    System.out.println("Now type and enter the model of the vehicle: ");
    rental_carModel = userInput.nextLine();


    if ((rental_carMake.equals("chevy") || rental_carMake.equals("chevrolet")) && rental_carModel.equals("silverado")){
      System.out.println("Perfect! We have the Chevrolet Silverado on stock for rental.");

    } else if(rental_carMake.equals("ford") && rental_carModel.equals("f150")){
      System.out.println("Congratulations! There is a Ford F150 in stock for rental");

    } else {
      System.out.println("I am sorry. We do not have the " + rental_carMake + rental_carModel + " on stock.");
    }


    userInput.close();
    System.out.println("Program is closed.");
  }
}
