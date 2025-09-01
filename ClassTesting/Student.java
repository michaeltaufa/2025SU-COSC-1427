/*
Program: Class Student
Description: 
  This class is focused on Student that will focus on
  displaying controlled attributes:
    - first name 
    - last name
    - student ID
    - student GPA

Created By: Michael Hikuleomtaufa
Date: 2025-08-24
*/

public class Student {
  // Attributes:
  private String firstName;
  private String lastName;
  private String studentID;
  private double studentGPA;

  // Constructor:
  public Student (String firstName, String lastName, String studentID, double studentGPA){
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentID = studentID;
    this.studentGPA = studentGPA;
  }

  // Methods:
  public void displayFullStudentName(){
    String fullStudentName = firstName + " " + lastName;
    System.out.println("Student Name: " + fullStudentName);
  }

  public void displayStudentID(){
    System.out.println("Student ID: " + studentID);
  }

  public void displayStudentGPA(){
    System.out.println("Student GPA: " + studentGPA);
  }

  public void isHonorRoll(){
    String fullStudentName = firstName + " " + lastName;

    if (studentGPA >= 3.5){
      System.out.println(fullStudentName + " is a honor roll student.");
    }
    else if (studentGPA < 3.5 && studentGPA >= 3.0){
      System.out.println(fullStudentName + " is almost eligible to be a honor roll student.");
    }
    else {
      System.out.println(fullStudentName + " is not a honor roll student.");
    }
  }


  public static void main(String[] args) {
  }
}
