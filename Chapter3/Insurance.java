/*
Program Name: Insurance 

Assignment:

The Harrison Group Life Insurance company computes annual policy premiums 
based on the age the customer turns in the current calendar year. 

The premium is computed by taking the decade of the customer’s age, adding 15 to it, and 
multiplying by 20. 

For example, a 34-year-old would pay $360, which is calculated 
by adding the decades (3) to 15 and then multiplying by 20. 

Write an application that prompts a user for the current year and a birth year. 
Pass both to a method that calculates and returns the premium amount, and then display the 
returned amount. 

Save the application as Insurance.java.

Created By: Michael Hikuleotmaufa
Date: 2025-07-26
*/

import java.util.Scanner;

public class Insurance {
  public static void main(String[] args) {

    int currentYear;
    int userBirthyear;
    int userAge;
    int userDecade;

    double totalPrice;
  
    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Insurance' Program, where we would calculate\nyour annual policy premium based on age.\n\nTo begin, please enter what year you were born: ");
    userBirthyear = userInput.nextInt();

    System.out.println("Next, please enter the current year: ");
    currentYear = userInput.nextInt();

    userAge = PremiumCalculator.calculateUserAge(userBirthyear, currentYear);
    System.out.println("Based on the information you provided, you are " + userAge + " years old.");

    userDecade = PremiumCalculator.calculateDecade(userBirthyear, currentYear);
    totalPrice = PremiumCalculator.calculatePremiumInsurance(userDecade);

    System.out.printf("\nResults:\nThe total price for the premium insurance is $%.2f USD.", totalPrice);

    userInput.close(); 
  }


  //  This class is used to calculate the premium rate of insurance.
  public class PremiumCalculator {

    public static int calculateUserAge(int birthYear, int currentYear){
      int userAge = currentYear - birthYear;
      return userAge;
    }

    public static int calculateDecade(int birthYear, int currentYear){
      int decade = (currentYear - birthYear)/ 10;
      return decade;
    }

    public static double calculatePremiumInsurance(int decade){
      double totalPrice = (decade + 15) * 20;
      return totalPrice;

    }

  }



}
