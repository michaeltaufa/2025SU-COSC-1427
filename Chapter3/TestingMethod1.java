// Testing calling methods through calculations.

import java.util.Scanner;

public class TestingMethod1 
{
  public static void main(String[] args) 
  {
    int employeeHoursWorked;

    Scanner userInput = new Scanner(System.in);

    System.out.println("How many hours of overtime did you work?");
    employeeHoursWorked = userInput.nextInt();

    calculateOvertime(employeeHoursWorked);
  }

  public static void calculateOvertime(double hours)
  {
    final double STD_RATE = 20.00;
    double totalPayAmount;
    totalPayAmount = hours * (STD_RATE * 1.5);

    System.out.println("Your base pay is $ " + STD_RATE + "/ hour.\nYou worked " + hours + " hours.");

    System.out.println("Your overtime pay is $" + totalPayAmount);
  }
}
