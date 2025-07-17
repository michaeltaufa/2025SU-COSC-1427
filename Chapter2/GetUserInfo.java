/*
Program Name: Get User Info 
Assignment:
  N/A

Program Description:
  This program is design to practice using the class Scanner
  to receive user input.

Created By: Michael Hikuleotmaufa
Date: 2025-07-16
*/

import  java.util.Scanner;

public class GetUserInfo 
{
  public static void main(String[] args) 
  {
    String name;
    int age;

    Scanner inputDevice = new Scanner(System.in);

    // Requires user age input
    System.out.print("Please enter your age: ");
    age = inputDevice.nextInt();

    // IMPORTANT!!! Needed when int input is placed before 'String' input
    inputDevice.nextLine();

    // Requires user name input
    System.out.print("Please enter your name: ");
    name = inputDevice.nextLine();

    System.out.println("Your name is " + name + " and you are " + age + " years old.");
  }
}
