/*
Program: Employee Class
Description: This program is a class Employee to have attributes such as 
first name, last name, employee number.
Created By: Michael Hikuleomtaufa
Date: 2025-08-09
*/

import java.util.Random;

public class Employee {

    // Attributes for Employee:
    private int employeeNumber;
    private String firstName;
    private String lastName;
    final private String COMPANY_NAME = "Tech LLC";
    final private int COMPANY_ID = 10001;

    // Constructors for Employee:
    // IMPORTANT: Constructors can control arugments used to create instances
    public Employee (String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
      this.employeeNumber = generateRandomID();
    }

    // Methods for classes:
    public void getEmployeeNumber(){
      System.out.println("Employee Number: " + employeeNumber);
    }

    public void getEmployeeName (){
      System.out.println("Employe Name: " + firstName + " " + lastName);
    }

    private int generateRandomID(){
      Random rand = new Random();
      return 1000 + rand.nextInt(9000);
    }

    public int getCompanyId(){
      System.out.println("Company ID: " + COMPANY_ID);
      return COMPANY_ID;
    }

    public String getCompanyName(){
      System.out.println("Company Name: " + COMPANY_NAME);
      return COMPANY_NAME;
    }

  public static void main(String[] args) {
  }
}
