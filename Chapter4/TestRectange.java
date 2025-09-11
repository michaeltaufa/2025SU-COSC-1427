/*
Program: Testing Rectangle Class 
Description: 
  This class is focused on testing the class, Rectange. 

Created By: Michael Hikuleomtaufa
Date: 2025-09-03
*/

import java.util.Scanner;

public class TestRectange {
  public static void main(String[] args) {

    double userHeight;
    double userWidth;

    Scanner userInput = new Scanner(System.in);

    System.out.println("Welcome to the 'Test Rectange' Program.");

    System.out.println("First, enter the height: ");
    userHeight = userInput.nextDouble();

    System.out.println("Next, enter the width: ");
    userWidth = userInput.nextDouble();

    Rectange userRectange = new Rectange(userHeight, userWidth);
    userRectange.displayArea();
    userRectange.displayPerimeter();
    userRectange.isSquare();

    userInput.close();
    System.out.println("Program has been sucessfully closed.");
  }
}
