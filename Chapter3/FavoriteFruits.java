/*
Program: Favorite Fruits 
Description:
  This program will focus on grabbing the user's input information of the following:
    - Name
    - Create a series of favorite fruits
    - Create conditional statements to check if fruits are listed
  Next, the argument will be passed into a method to do the following:
    - Greet the User
    - Display message of the User's favorite fruits 

Created by: Michael Hikuleomtaufa 
Date: 2025-08-18
*/

import java.time.LocalDate;
import java.util.Scanner;

public class FavoriteFruits {
  public static void main(String[] args) {

    String username;
    String user_favoriteFruit;
    String user_continueProgram;
    boolean programStatus = true;

    Scanner userInput = new Scanner(System.in);
    LocalDate today = LocalDate.now();

    System.out.println(today);
    System.out.println("Welcome to the 'Favorite Fruits' program. Please enter your name: ");
    System.out.println(today);

    username = userInput.nextLine();
    greetUser(username);

    while (programStatus == true){

      System.out.println("Enter to check if your favorite fruit is on the list: ");
      user_favoriteFruit = userInput.nextLine();

      if (user_favoriteFruit.equals("apple") || user_favoriteFruit.equals("pineapple") || user_favoriteFruit.equals("kiwi")){
        displayFavoriteFruit(user_favoriteFruit);

        System.out.println("Do you want to continue: yes (y) or no (n): ");
        user_continueProgram = userInput.nextLine();

      } else {
        System.out.println("I'm sorry. It seems that " + user_favoriteFruit + " is not on the list.");
        System.out.println("Do you want to continue: yes (y) or no (n): ");
        user_continueProgram = userInput.nextLine();
      }

      if (user_continueProgram.equals("n")){
        programStatus = false;

      } else {
        programStatus = true;
      }
    }

    userInput.close();
    System.out.println("Program closed.");
  }
  
  public static void greetUser(String username){
    System.out.println("Hello " + username + "! Let's start checking your favorite fruits.");
  }

  public static void displayFavoriteFruit(String favoriteFruit){
    System.out.println("Wow, " + favoriteFruit + " are tastly! I didnt know you like " + favoriteFruit);
  }

}
