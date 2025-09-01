/*
Program: Input Student Information 

Description: 
  This program will be focused on input student information.

Created By: Michael Hikuleomtaufa
Date: 2025-08-28
*/

import java.util.Scanner;

public class inputStudentInformation {
 public static void main(String[] args) {

    String userStudentFirstName;
    String userStudentLastName;
    String userStudentID;
    double userStudentGPA;

    Scanner userInput = new Scanner(System.in);
    System.out.println("Welcome to the 'Add Student Program'.");

    System.out.println("Enter student first name: ");
    userStudentFirstName = userInput.nextLine();

    System.out.println("Enter student last name: ");
    userStudentLastName = userInput.nextLine();

    System.out.println("Enter student ID number: ");
    userStudentID = userInput.nextLine();

    System.out.println("Enter student GPA (0.0 - 4.0): ");
    userStudentGPA = userInput.nextDouble();


    Student userStudentInput = new Student(userStudentFirstName, userStudentLastName, userStudentID, userStudentGPA);
    System.out.println("Results:\n");
    userStudentInput.displayFullStudentName();
    userStudentInput.displayStudentID();
    userStudentInput.displayStudentGPA();
    userStudentInput.isHonorRoll();


    userInput.close();
    System.out.println("Program closed.");
  }
}
