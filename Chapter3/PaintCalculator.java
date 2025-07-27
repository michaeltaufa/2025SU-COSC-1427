/*
Program Name: Paint Calculator 

Assignment:

Assume that a gallon of paint covers about 350 square feet of wall space.

Create an application with a main() method that prompts the user for the 
length, width, and height of a rectangular room. Pass these three values 
to a method that does the following:

Calculates the wall area for a room

Passes the calculated wall area to another method that calculates and 
returns the number of gallons of paint needed

Displays the number of gallons needed

Computes the price based on a paint price of $32 per gallon, assuming 
that the painter can buy any fraction of a gallon of paint at the same 
price as a whole gallon

Returns the price to the main() method

The main() method displays the final price. For example, the cost to 
paint a 15-by-20-foot room with 10-foot ceilings is $64. Save the 
application as PaintCalculator.java.

Created By: Michael Hikuleotmaufa
Date: 2025-07-26
*/

import java.util.Scanner;

public class PaintCalculator {
  public static void main(String[] args) {

    double lengthRoom;
    double widthRoom;
    double heightRoom;
    double totalAreaRoom;

    double paintGallonsNeeded;
    double totalPrice;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Paint Calculator' program.");

    System.out.println("Please enter the room's length in feet: ");
    lengthRoom = userInput.nextDouble();

    System.out.println("Please enter the room's width in feet: ");
    widthRoom = userInput.nextDouble();

    System.out.println("Please enter the room's height in feet: ");
    heightRoom = userInput.nextDouble();

    totalAreaRoom = CalculatorRoom.calculateTotalArea(lengthRoom, widthRoom, heightRoom);
    paintGallonsNeeded = CalculatorPaintGallon.calculatePaintGallons(totalAreaRoom);
    totalPrice = CalculatorPricePaintJob.calculateTotalPrice(paintGallonsNeeded);

    System.out.printf("\nResults:\nThe total wall area of the room is %.2f ft.", totalAreaRoom);
    System.out.printf("\nThe amount of gallons of paint needed %.2f gal for a ", paintGallonsNeeded);
    System.out.printf("\nThe total cost is %.2f USD.", totalPrice);

    userInput.close();
  }




  // This class is used to calculate the total area of the room.
  public class CalculatorRoom {

    public static double calculateTotalArea (double length, double width, double height){
      double totalArea = 2 * ((length * height) + 2 * (width * height));

      return totalArea;
    }

  }

  public class CalculatorPaintGallon {
    public static double calculatePaintGallons(double wallArea){

      final double paintCoverage = 350.00;
      double gallonsPaintNeeded;

      gallonsPaintNeeded = (wallArea/ paintCoverage);

      return gallonsPaintNeeded;
    }

  }

  // This class is used to calculate the total price of gallons of paint needed.
  public class CalculatorPricePaintJob {
    public static double calculateTotalPrice (double gallons){

      final double PricePerGallon = 32.00;
      double totalPrice;

      totalPrice = PricePerGallon * gallons;

      return totalPrice;
    }
  }
}
