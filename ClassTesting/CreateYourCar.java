/*
Program: Create Your Car 
Description: 
  This program is focused on building your car

Created By: Michael Hikuleomtaufa
Date: 2025-08-24
*/

import java.util.Scanner;

public class CreateYourCar {
  public static void main(String[] args) {

  String userAction;

  int userCarYear;
  String userCarMake;
  String userCarModel;
  String userCarColor;

  int userEngineCylinders;
  String userEngineSize;

  Scanner userInput = new Scanner(System.in);

  // Car User Input:
  System.out.println("Welcome to the 'Create Your Car' Program.");
  System.out.println("First, enter the year of your car: ");
  userCarYear = userInput.nextInt();


  System.out.println("Car Year: " + userCarYear);
  System.out.println("Next, enter the make of your car: ");
  userCarMake = userInput.nextLine();
  userCarMake = userInput.nextLine();

  System.out.println("Now, enter the model of your car: ");
  userCarModel = userInput.nextLine();

  System.out.println("Lastly, enter the color of your car: ");
  userCarColor = userInput.nextLine();



  // Engine User Input:
  System.out.println("We are almost done! How many cylinders does your car have: ");
  userEngineCylinders = userInput.nextInt();

  System.out.println("Lastly, what is the size of your engine: ");
  userEngineSize = userInput.nextLine();
  userEngineSize = userInput.nextLine();

  Car userCarCreated = new Car(userCarYear, userCarMake, userCarModel, userCarColor);
  Engine userEngineCreated = new Engine(userEngineCylinders, userEngineSize);

  System.out.println("Press the following:\n(1) - Turn the Car On\n(2) - Turn the Car Off");
  userAction = userInput.nextLine();

  if (userAction.equals("1")){
    userCarCreated.turnCarOn();
    userEngineCreated.displayCylinders();
  }
  else if (userAction.equals("2")){
    userCarCreated.turnCarOff();
    userEngineCreated.displaySizeEngine();
  }
  else {
    System.err.println("Incorrect Input.");
  }



  userInput.close();
  System.out.println("Program is closed.");
  }
}
