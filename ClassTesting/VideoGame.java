/*
Program: Video Game Class
Description: This program is a Video Game class.
Created By: Michael Hikuleomtaufa
Date: 2025-08-09
*/

public class VideoGame {

  private String videoGameTitle;
  private String videoGameStudio;
  private double videoGamePrice;

  public VideoGame (String videoGameTitle, String videoGameStudio, double videoGamePrice){
    this.videoGameTitle = videoGameTitle;
    this.videoGameStudio = videoGameStudio;
    this.videoGamePrice = videoGamePrice;
  }

  public String getVideoGameTitle(){
    System.out.println("The video game title is " + videoGameTitle);
    return videoGameTitle;
  } 

  public String getVideoGameStudio(){
    System.out.println("The studio is " + videoGameStudio);
    return videoGameStudio;
  }

  public String getVideoGamePrice(){
    String formattedPrice = String.format("%.2f", videoGamePrice);
    System.out.println("The price of the game is " + formattedPrice);
    return formattedPrice; 
  }

  public static void main(String[] args) {
  }
}
