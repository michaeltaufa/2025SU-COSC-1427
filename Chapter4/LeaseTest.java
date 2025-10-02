/*
Program: Lease Testing

Description:
This program will be used to test the class Lease.

Created By: Michael Hikuleomtaufa
Date: 2025-09-27
*/

import java.util.Scanner;

public class LeaseTest {
  public static void main(String[] args) {

    String userFirstName;
    String userLastName;

    int userApartmentNumber;
    int userLeaseTerm;

    double userMonthRent;

    String userPetInput;
    boolean havePet;

    Scanner userInput = new Scanner(System.in);
    Lease testLease = new Lease("Michael", "Smith", 1000, 500.00, 5);


    System.out.println("Welcome to the 'LeaseTest' program.");

    System.out.println("Enter your first name: ");
    userFirstName = userInput.nextLine();
    testLease.setTennantFirstName(userFirstName);


    System.out.println("Enter your last name: ");
    userLastName = userInput.nextLine();
    testLease.setTennantLastName(userLastName);


    System.out.println("How many months do you want to rent: ");
    userLeaseTerm = userInput.nextInt();
    testLease.setLeaseTerm(userLeaseTerm);


    System.out.println("Enter your desired apartment number: "); 
    userApartmentNumber = userInput.nextInt();
    testLease.setApartmentNumber(userApartmentNumber);


    System.out.println("How much would your monthly rent cost: ");
    userMonthRent = userInput.nextDouble();
    testLease.setMonthlyRent(userMonthRent);
    userInput.nextLine();


    System.out.println("Do you have a pet?\nType the following - Yes(y) or No(n): ");
    userPetInput = userInput.nextLine();

    if (userPetInput.equals("y")){
      havePet = true;
      testLease.setTotalCosts(havePet);
      testLease.displayPetPolicy();
    }
    else if (userPetInput.equals("n")){
      havePet = false;
      testLease.setTotalCosts(havePet);
    }



    System.out.println("\nResults:");
    testLease.displayFullTenantName();
    testLease.displayApartmentNumber();
    testLease.displayLeaseTerm();
    testLease.displayMonthlyRent();
    testLease.displayTotalCost();


    userInput.close();
    System.out.println("\nProgram is closed.");
  }
}
