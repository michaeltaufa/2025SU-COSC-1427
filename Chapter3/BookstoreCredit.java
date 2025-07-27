/*
Program Name: Book Store Credit

Assignment:
To encourage good grades, Hermosa High School has decided to award each 
student a bookstore credit that is 10 times the student’s grade point average. 
In other words, a student with a 3.2 grade point average receives a $32 credit. 

Create a class that prompts a student for a name and grade point 
average and then passes the values to a method that displays a descriptive message. 
The message uses the student’s name, echoes the grade point average, and 
computes and displays the credit. 

Save the application as BookstoreCredit.java.

Created By: Michael Hikuleotmaufa
Date: 2025-07-20
*/

import java.util.Scanner;

public class BookstoreCredit{

  public static void main(String[] args) {

    String studentName;
    double studentGPA;

    Scanner studentInput = new Scanner(System.in);

    System.out.println("Please enter your name: ");
    studentName = studentInput.nextLine();
    System.out.println("Please enter your GPA: ");
    studentGPA = studentInput.nextDouble();

    StudentStoreCredit.convertStudentCredit(studentName, studentGPA);

    // IMPORTANT to close scanner to not create any problems.
    studentInput.close();
  }


  public class StudentStoreCredit{
    public static void convertStudentCredit(String studentName, Double studentGPA){

      double gpaStudentCredit = studentGPA * 10.0;

      System.out.println("Welcome " + studentName + "! Below is your reported GPA:");
      System.out.println("\nStudent Credit Conversion:\n" + studentName + "'s GPA: " + studentGPA);
      System.out.printf("You will receive $%.2f credit", gpaStudentCredit);
    }
  }

}
