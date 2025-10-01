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
    String ownPetAnswer;

    int userApartmentNumber;
    int userLeaseTerm;

    double userMonthRent;

    Scanner userInput = new Scanner(System.in);
    Lease testLease = new Lease("Michael", "Smith", 1000, 500.00, 5);

    System.out.println("Welcome to the 'LeaseTest' program.");

    System.out.println("Enter your first name: ");
    userFirstName = userInput.nextLine();
    testLease.changeTenantFirstName(userFirstName);

    System.out.println("Enter your last name: ");
    userLastName = userInput.nextLine();
    testLease.changeTenantLastName(userLastName);

    System.out.println("Type for the following, Yes (y) or No (n)\nDo you own a pet: ");
    ownPetAnswer = userInput.nextLine();

    if (ownPetAnswer.equals("y")){
      testLease.addPetFee();
      testLease.changeMonthlyRent(monthRent)
    }

    System.out.println("How many months do you want to rent: ");
    userLeaseTerm = userInput.nextInt();
    testLease.changeLeaseTerm(userLeaseTerm);

    System.out.println("Enter the apartment number: "); 
    userApartmentNumber = userInput.nextInt();
    testLease.changeApartmentNumber(userApartmentNumber);

    System.out.println("How much would your monthly rent cost: ");
    userMonthRent = userInput.nextDouble();
    testLease.changeMonthlyRent(userMonthRent);
    testLease.changeTotalRent(userMonthRent);


    testLease.displayFullTenantName();
    testLease.displayTotalRent();
    testLease.displayMonthlyRent();
    testLease.displayApartmentNumber();
    testLease.displayLeaseTerm();


    userInput.close();
  }
}
