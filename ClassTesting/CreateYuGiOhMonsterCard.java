/*
Program: Create Yu-Gi-Oh Monster Card
Description: 
  This program will be focused on using the class 'YuGiOh_MonsterCard' to
  create monster cards based on the user's input

Created By: Michael Hikuleomtaufa
Date: 2025-08-23
*/

import java.util.Scanner;

public class CreateYuGiOhMonsterCard {
  public static void main(String[] args) {

  // User information
  String username;
  String userAction;
  String continueProgram;
  boolean programStatus = true;

  String userMonsterCardName = "";
  int userMonsterLevel = 0;
  int userAttackLevel = 0;
  int userDefenseLevel = 0;
  String userMonsterDescription = "";

  Scanner userInput = new Scanner(System.in);

  System.out.println("To begin program, please enter your name: ");
  username = userInput.nextLine();
  System.out.println("Welcome " + username + " to the 'Create Your Yu-Gi-Oh Monster Card' program.");

  while (programStatus) {
    System.out.println("First, enter a name for the monster you want to create: ");
    userMonsterCardName = userInput.nextLine();
    System.out.println("Awesome! " + userMonsterCardName + " is a cool name.");

    System.out.println("Next, what is the monster level you are thinking for " + userMonsterCardName + "?");
    userMonsterLevel = userInput.nextInt();
    System.out.println("Interesting. " + userMonsterLevel + " stars is fitting for " + userMonsterCardName);

    System.out.println("Now the fun part. Enter the attack level of " + userMonsterCardName + " : ");
    userAttackLevel = userInput.nextInt();

    System.out.println("We are almost done! Now, enter the defense level of " + userMonsterCardName + " : ");
    userDefenseLevel = userInput.nextInt();

    System.out.println("Lastly, create a description for " + userMonsterCardName + " that can be centered around lore, tales, and many more.\nEnter description: ");
    userMonsterDescription = userInput.nextLine();
    userMonsterDescription = userInput.nextLine();

    System.out.println("Now, let's quickly reflect the monster you created.\nResults:");
    System.out.println("Monster Name: " + userMonsterCardName);
    System.out.println("Monster Level: " + userMonsterLevel + " stars");
    System.out.println("Attack Level: " + userAttackLevel);
    System.out.println("Defense Level: " + userDefenseLevel);
    System.out.println("Description: " + userMonsterDescription);

    System.out.println("\nPlease type the following to continue (c) or restart (r): ");
    continueProgram = userInput.nextLine();

    if (continueProgram.equals("c")){
      programStatus = false;
    } else {
      System.out.println("Restarting Yu-Gi-Oh Monster Creation Program.\n\n");
      }
  }

  YuGiOh_MonsterCard userMonsterCreated = new YuGiOh_MonsterCard(userMonsterCardName, userMonsterLevel, userAttackLevel, userDefenseLevel, userMonsterDescription);
  programStatus = true;

  // Summon Monster Card: 
  while (programStatus) {
    System.out.println(username + "! Now, type 's' to summon " + userMonsterCardName + " : ");
    userAction = userInput.nextLine();

    if (userAction.equals("s")){
      userMonsterCreated.summonMonsterCard();
      programStatus = false;
    } else {
      System.out.println("You type the wrong input.");
    }
  }

  // View Monster Card Information:
    // - display monster card level
    // - display monster card attack level
    // - display monster card defense level
    // - display monster card description
  
  programStatus = true;

  while (programStatus) {
    System.out.println("Now, type the following to view " + userMonsterCardName + "'s information.");
    System.out.println("Type the following:\n(1) - Display Monster Card Level\n(2) - Display Attack Level\n(3) - Display Defense Level\n(4) - Display Monster Card Description\n(q) - Quit and exit program.");
    userAction = userInput.nextLine();

    if (userAction.equals("1")){
      userMonsterCreated.displayMonsterLevel();
    } 
    else if (userAction.equals("2")){
      userMonsterCreated.displayAttackLevel();
    }
    else if (userAction.equals("3")){
      userMonsterCreated.displayDefenseLevel();
    }
    else if (userAction.equals("4")){
      userMonsterCreated.displayMonsterDescription();
    }
    else if (userAction.equals("q")){
      programStatus = false;
    }
    else {
      System.out.println("Incorrect input. Please try again.");
    }
  }





  userInput.close();
  System.out.println("Program close.");

  }
}
