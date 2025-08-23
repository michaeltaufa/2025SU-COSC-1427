/*
Program: Video Game Class
Description: This program is a Video Game class.

Update: 2025-08-22
  - Updated Class VideoGame and added new attribute class 'VideoGameStudio'

Created By: Michael Hikuleomtaufa
Date: 2025-08-09
*/

public class VideoGame {

  // Attributes:
  private String videoGameTitle;
  private double videoGamePrice;
  
  private VideoGameStudio videoGameStudio;

  // Constructor:
  public VideoGame (String videoGameTitle, double videoGamePrice){
    this.videoGameTitle = videoGameTitle;
    this.videoGamePrice = videoGamePrice;
  }


  // Methods:
  public String getVideoGameTitle(){
    System.out.println("The video game title is " + videoGameTitle);
    return videoGameTitle;
  } 

  public String getVideoGamePrice(){
    String formattedPrice = String.format("%.2f", videoGamePrice);
    System.out.println("The price of the game is " + formattedPrice);
    return formattedPrice; 
  }





  public static void main(String[] args) {
  }
}
