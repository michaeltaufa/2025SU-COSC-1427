/*
Program: Class Engine 
Description: 
  This class is focused on Engine 

  Important attributes to focus on car is the following:
  - Cylinders (V6, V8, etc...)
  - Size of engine (Small, Medium, Large)

Created By: Michael Hikuleomtaufa
Date: 2025-08-24
*/

public class Engine {
  // Attributes:
  int cylinders;
  String sizeOfEngine;

  // Constructor:
  public Engine (int cylinders, String sizeOfEngine){
    this.cylinders = cylinders;
    this.sizeOfEngine = sizeOfEngine;
  }

  // Methods:
  public void displayCylinders(){
    System.out.println("The engine has " + cylinders + " cylinders and is a V" + cylinders);
  }

  public void displaySizeEngine(){
    System.out.println("The size of the engine is " + sizeOfEngine);
  }

 public static void main(String[] args) {
 } 
}
