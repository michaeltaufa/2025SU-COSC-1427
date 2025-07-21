/*
Program Name: Inch Conversion 

Assignment:

There are 12 inches in a foot and 3 feet in a yard. 

Create a class named InchConversion. Its main() method accepts a value in inches 
from a user at the keyboard and then passes the entered value to two methods. 

One converts the value from inches to feet, and the other converts the same value 
from inches to yards. 

Each method displays the results with appropriate explanation. 

Save the application as InchConversion.java.

Created By: Michael Hikuleotmaufa
Date: 2025-07-20
*/

import java.util.Scanner;


public class InchConversion {
  public static void main(String[] args) {

    double incheConvert;

    // Input:
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter a number to convert inches into feet and yards: ");

    incheConvert = userInput.nextDouble();

    // Output:
    InchFootYardConversion.convertYard(InchFootYardConversion.convertFeet(incheConvert));

    userInput.close();
  }



  public class InchFootYardConversion{
    
    // Convert inches into feet:
    public static double convertFeet(double inches){
      double feet = inches/ 12.00;
      System.out.println(inches + "in. has been converted to " + feet + " ft.");
      return feet;
    }
    
    // Convert feet into yard
    public static void convertYard(double feet){
      double yards = feet / 3;
      System.out.println(feet + "ft. has been converted to " + yards + " yd.");
    }
  }



}
