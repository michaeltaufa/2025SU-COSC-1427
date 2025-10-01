/*
Program: Lease

Description:
Create a class named Lease with fields that hold an apartment tenant’s 
name, apartment number, monthly rent amount, and term of the lease in months. - COMPLETE

Include a default constructor that initializes the name to XXX, the apartment 
number to 0, the rent to 1000, and the term to 12. - COMPLETE

Also include methods to get and set each of the fields.

Include a nonstatic method named addPetFee() that adds $10 to the monthly 
rent value and calls a static method named explainPetPolicy() that 
explains the pet fee. - COMPLETE

Save the class as Lease.java.

Created By: Michael Hikuleomtaufa
Date: 2025-09-27
*/

public class Lease {

  // Attributes:
  private String tenantfirstName;
  private String tenantLastName;

  private int apartmentNumber;

  private double monthlyRent;
  private double totalRentCost;
  private int leaseTerm;

  private boolean havePet;

  // Constructor:
  public Lease (String tenantfirstName, String tenantLastName, int apartmentNumber, double monthlyRent, int leaseTerm){
    this.tenantfirstName = "XXX";
    this.tenantLastName = "XXX";
    this.apartmentNumber = 0;
    this.monthlyRent= 1000.00;
    this.leaseTerm = 12;
  }

  // Method (Display Information):
  public void displayFullTenantName(){
    String tenantFullName = tenantfirstName + " " + tenantLastName;
    System.out.println(tenantFullName);
  }

  public void displayApartmentNumber(){
    System.out.println("\nApartment Room Number: " + apartmentNumber);
  }

  public void displayMonthlyRent(){
    System.out.printf("\nMonthly Rent: $%.2f", monthlyRent);
  }

  public void displayTotalRent(){
    System.out.printf("\nTotal Rent: $%.2f", totalRentCost);
  }

  public void displayLeaseTerm (){
    System.out.println("\nMonth Lease Term: " + leaseTerm + " months");
  }

  public void displayPetPolicy(){
    System.out.println("\nPet Policy:\nThere is a $10 pet policy that applies per pet, which will help cover cleaning and facility maintenance.");
  }


  // 'Set' Methods:
  // These methods will set and overwrite values from the default values
  // of the class, Lease
  
  public String setTennantFirstName(String firstName){
    tenantfirstName = firstName;
    return tenantfirstName;
  }

  public String setTennantLastName(String lastName){
    tenantLastName = lastName;
    return tenantLastName;
  }

  public String setTennantFullName(String firstName, String lastName){
    String tenantFullName = firstName + " " + lastName;
    return tenantFullName;
  }

  public int setApartmentNumber(int unitNumber){
    apartmentNumber = unitNumber;
    return apartmentNumber;
  }

  public int setLeaseTerm(int leaseMonths){
    leaseTerm = leaseMonths;
    return leaseTerm;
  }


  // WORK HERE -----------------------------------
  public double setMonthlyRent(double monthlyRentCost){
    monthlyRent = monthlyRentCost;
    return monthlyRent;
  }











  public static void main(String[] args) {
  }
}
