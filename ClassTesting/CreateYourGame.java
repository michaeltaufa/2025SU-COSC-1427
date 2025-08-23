/*
Program: Create Your Video Game 
Description: This program is focused on using the following classes:
  - VideoGame
  - VideoGameStudio

This program will be focused on user input information to create 
a video game and display all the information.

Created By: Michael Hikuleomtaufa
Date: 2025-08-22
*/

import java.util.Scanner;

public class CreateYourGame{

 public static void main(String[] args) {

  String continueProgram;
  boolean programStatus = true;
  
  // NOTE: values has placeholders due to local variable intializing in while loops
  String gameTitle = "";
  double gamePrice = 0.0;

  String studioName = "";
  String studioCountry = "";
  String studioCity = "";
  int totalNumberEmployee = 0;

  Scanner userInput = new Scanner(System.in);


  System.out.println("Welcome to the 'Build Your Game' program.");

  while (programStatus){

    System.out.println("What is the title of your video game: ");
    gameTitle = userInput.nextLine();
    System.out.println(gameTitle + " is a cool name!");

    System.out.println("Now, what is the price you would set for your video game: ");
    gamePrice = userInput.nextDouble();
    System.out.println("Interesting! " + gamePrice + " is fitting for a title such as " + gameTitle);

    System.out.println("Do you want to continue (c) or restart (r): ");

    // NOTE: nextLine(); is needed due as a buffer or will bypass
    userInput.nextLine();
    continueProgram = userInput.nextLine();

    if (continueProgram.equals("c")){
        programStatus = false;
    }
  }

  programStatus = true;

  while (programStatus){

    System.out.println("Now, lets focus on the studio that will create " + gameTitle + " that cost $" + gamePrice);
    System.out.println("What is the name of your studio: ");
    studioName = userInput.nextLine();
    System.out.println(studioName + " is a cool and fitting name!");

    System.out.println("What country is your studio located: ");
    studioCountry = userInput.nextLine();
    System.out.println(studioCountry + " is a fantastic country!");

    System.out.println("What city is your studio is located: ");
    studioCity = userInput.nextLine();
    System.out.println(studioCity + " is a great city!");

    System.out.println("Lastly, how many people is in this studio: ");
    totalNumberEmployee = userInput.nextInt();
    System.out.println("Wow! " + totalNumberEmployee + " of employees is a good amount!");

    System.out.println("Do you want to continue (c) or restart (r): ");
    userInput.nextLine();
    continueProgram = userInput.nextLine();

    if (continueProgram.equals("c")){
        programStatus = false;
    }
  }

  VideoGame userVideoGame = new VideoGame(gameTitle, gamePrice);
  VideoGameStudio userVideoGameStudio = new VideoGameStudio(studioName, studioCountry, studioCity, totalNumberEmployee);

  System.out.println("\nVideo Game Results:");
  userVideoGame.getVideoGameTitle();
  userVideoGame.getVideoGamePrice();

  System.out.println("\nStudio Game Results:");
  userVideoGameStudio.displayStudioName();
  userVideoGameStudio.displayCity();
  userVideoGameStudio.displayCountry();
  userVideoGameStudio.displayNumberOfEmployees();
  
  userInput.close();
  System.out.println("\nProgram is closed.");
 } 
}
