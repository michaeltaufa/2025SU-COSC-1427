/*
Program: Rectange Class
Description: 
  This class is focused a rectangle. 

  Important attributes to focus on rectange is the following:
  - Width
  - Height

  Methods:
  - display the area
  - display the perimeter
  - is this a square?

Created By: Michael Hikuleomtaufa
Date: 2025-09-03
*/

public class Rectange {

  // Attributes:
  private double Height;
  private double Width;

  // Constructor:
  public Rectange(double Height, double Width){
    this.Height = Height;
    this.Width = Width;
  }

  // Methods:
  public void displayArea(){
    double totalArea = Width * Height;
    System.out.println("Total area: " + totalArea);
  }

  public void displayPerimeter(){
    double totalPerimeter = 2 * (Height * Width);
    System.out.println("Total Perimeter: " + totalPerimeter);
  }

  public void isSquare(){
    if (Width == Height){
      System.out.println("This is a square. Below is the following measurements:\n");
    }
    else {
      System.out.println("These measurements appears to be a rectangle and is not a square.");

    }
  }

  public static void main(String[] args) {
  }
}
