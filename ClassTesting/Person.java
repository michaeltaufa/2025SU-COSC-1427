/*
Program: Person Class
Description: This program is a class Person, that has multiple attributes
and practice controlling data that is printed out and shared.
Created By: Michael Hikuleomtaufa
Date: 2025-08-15
*/

public class Person {

  private String firstName;
  private String lastName;
  private int age;
  private String schoolName;
  private double gpa;
  private String mobilePhoneNumber;

  public Person (String firstName, String lastName, int age, String schoolName, double gpa, String mobilePhoneNumber){
    this.firstName = firstName;
    this.lastName =  lastName;
    this.age = age;
    this.schoolName = schoolName;
    this.gpa = gpa;
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  public void getFullName(){
    System.out.println("Hello, My name is " + firstName + " " + lastName);
  }

  public void getAge(){
    System.out.println("I am " + age + " years old.");
  }

  public void getSchool(){
    System.out.println("I attend to " + schoolName);
  }

  public void getGPA(){
    System.out.println("I have a " +  gpa + " gpa.");
  }

  public void getPhoneNumber(){
    String censoredPhoneNumber = mobilePhoneNumber + "****";
    System.out.println("Phone number: " + censoredPhoneNumber);
  }

  public static void main(String[] args) {
  }
}
