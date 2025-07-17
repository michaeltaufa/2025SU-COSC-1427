/*
Program Name: Integer Demo Interactive 
Assignment:
  N/A

Program Description:
  This program is design to practice using the class Scanner
  to receive user input.

Created By: Michael Hikuleotmaufa
Date: 2025-07-16
*/

import  java.util.Scanner;

public class IntegerDemoInteractive {
  public static void main(String[] args) {

    int userInt;
    byte userByte;
    short userShort;
    long userLong;
    String userName;

    Scanner inputDevice = new Scanner(System.in);

    System.out.print("Please enter an integer: ");
    userInt = inputDevice.nextInt();

    System.out.print("Please enter a byte: ");
    userByte = inputDevice.nextByte();

    System.out.print("Please enter a short integer: ");
    userShort = inputDevice.nextShort();

    System.out.print("Please enter a long integer: ");
    userLong = inputDevice.nextLong();

    inputDevice.nextLine();

    System.out.print("Pleas enter your name: ");
    userName = inputDevice.nextLine();

    // Output to view user input
    System.out.println("Thank you " + userName + "!");
    System.out.println("The int is " + userInt);
    System.out.println("The byte is " + userByte);
    System.out.println("The short int is " + userShort);
    System.out.println("The long int is " + userLong);
  }
}
