/*
Program Name: Test Month Handling 

Assignment:
Write a program that declares two LocalDate objects and prompts the user for values. 
Display output that demonstrates the dates displayed when one, two, and three months 
are added to each of the objects. 

(When you test the program, be sure to try some date late in the month so you 
can observe what happens when a following month does not have as many days.) 

Save the application as TestMonthHandling.java.

Created By: Michael Hikuleotmaufa
Date: 2025-09-07
*/

import java.time.LocalDate;
import java.util.Scanner;

public class TestMonthHandling {

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.println(LocalDate.now());



    userInput.close();
  }
}
