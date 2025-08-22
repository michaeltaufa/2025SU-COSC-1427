/*
Program: Favorite Book
Description:
  This program will focus on grabbing the user's input information of the following:
    - Name
    - Favorite Book
    - Author
  Next, the argument will be passed into a method to do the following:
    - Greet the User
    - Display message of the User's favorite book by the author

Created by: Michael Hikuleomtaufa 
Date: 2025-08-16
*/

import java.util.Scanner;

public class FavoriteBook {

 public static void main(String[] args) {

    String username;
    String favoriteBook;
    String favoriteAuthor;

    Scanner userInput = new Scanner(System.in);
    System.out.println("Welcome to the 'Favorite Book' Program.\nPlease enter your name: ");

    username = userInput.nextLine();
    greetUser(username);

    System.out.println("Now, what is your favorite book: ");
    favoriteBook = userInput.nextLine();

    System.out.println("Who is the author that wrote '" + favoriteBook + "'?");
    favoriteAuthor = userInput.nextLine();

    favoriteBook(favoriteBook, favoriteAuthor);

    userInput.close();
    System.out.println("\nProgram completed.");
 } 


  public static void greetUser(String username){
    System.out.println("Hello " + username);
  }

  public static void favoriteBook(String favoriteBook, String favoriteAuthor){
    System.out.println("Awesome! Your favorite book is '" + favoriteBook + "' that is written by '" + favoriteAuthor + "'.");
  }

}
