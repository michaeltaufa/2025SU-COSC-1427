/*
Program: Testing Classes
Description: This program is created to call classes and functions.
Created by: Michael Hikuleotmaufa
Date: 2025-08-09
 */

public class testClass {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Michael", "Taufa");
    System.out.println("\nThis is object 'employee1':");
    employee1.getEmployeeNumber();
    employee1.getEmployeeName();
    employee1.getCompanyName();
    employee1.getCompanyId();

    Employee employee2 = new Employee("John", "Smith");
    System.out.println("\nThis is object 'employee2':");
    employee2.getEmployeeNumber();
    employee2.getEmployeeName();
    employee2.getCompanyName();
    employee2.getCompanyId();

    Person person1 = new Person("John", "Smith", 33, "Woodside High School", 2.5, "4159088888");
    System.out.println("\nThis is object Person 'person1':");
    person1.getFullName();
    person1.getPhoneNumber();

    System.out.println("\nThis is object VideoGame 'darkSouls3':");
    VideoGame darkSouls3 = new VideoGame("Dark Souls 3", "Fromsoftware Inc.", 49.99);
    darkSouls3.getVideoGameTitle();
    darkSouls3.getVideoGameStudio();
    darkSouls3.getVideoGamePrice();
  }
}
