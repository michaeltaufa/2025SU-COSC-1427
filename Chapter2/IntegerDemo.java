/*
Program Name: Integer Demo 
Assignment:
  N/A

Program Description:
  This program is design to practice using different int types such
  as byte, short, int, and long.

Created By: Michael Hikuleotmaufa
Date: 2025-07-16
*/

public class IntegerDemo {
  public static void main(String[] args) {

    // Declared a long range of int types to test
    int anInt = 1234;
    byte aByte = 12;
    short aShort = 12345;
    long aLong = 1234567890987654321L;

    int anotherInt = anInt * 10000000;

    // Output:
    System.out.println("The int is " + anInt);
    System.out.println("The byte is " + aByte);
    System.out.println("The short is " + aShort);
    System.out.println("The long is " + aLong);


    System.out.println("Another int is " + anotherInt);
    }
  }
