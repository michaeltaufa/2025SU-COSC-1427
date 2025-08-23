/*
Class: Video Game Studio Class
Description: This class is a Video Game Studio class.

Update: 2025-08-22
  - Updated Class VideoGame and added new attribute class 'VideoGameStudio'

Created By: Michael Hikuleomtaufa
Date: 2025-08-09
*/

public class VideoGameStudio {

  // Attributes:
  private String studioName;
  private String country;
  private String city;
  private int numberOfEmployees;

  // Constructor:
  public VideoGameStudio (String studioName, String country, String city, int numberOfEmployees){
    this.studioName = studioName;
    this.country = country;
    this.city = city;
    this.numberOfEmployees = numberOfEmployees;
  }

  // Methods:
  public void displayStudioName(){
    System.out.println("Studio Name: " + studioName);
  }

  public void displayCountry(){
      System.out.println("Country: " + country);
    }

  public void displayCity(){
      System.out.println("City: " + city);
    }

  public void displayNumberOfEmployees(){
    System.out.println("Total Number of Employee: " + numberOfEmployees);
  }





  public static void main(String[] args) {
  }
}
