/*
Program: Class Car 
Description: 
  This class is focused on car

  Important attributes to focus on car is the following:
  - Car Make
  - Car Model
  - Car Color
  - Engine (Import from another class)

  Important methods to focus on the car is the following:
  - Turn On Car
  - Turn Off Car

Created By: Michael Hikuleomtaufa
Date: 2025-08-24
*/

public class Car {

  // Attributes:
  int carYear;
  String carMake;
  String carModel;
  String carColor;

  private Engine engine; 

  // Constructor;
  public Car (int carYear, String carMake, String carModel, String carColor){
    this.carYear = carYear;
    this.carMake = carMake;
    this.carModel = carModel;
    this.carColor = carColor;
  } 

  // Methods:
  public void turnCarOn(){
    System.out.println("The '" + carYear + " " + carMake + " " + carModel + "' is turned on.");
  }

  public void turnCarOff(){
    System.out.println("The '" + carYear + " " + carMake + " "+ carModel + "' is turned off.");
  }

  public static void main(String[] args) {
  }
}
