/*
Program Name: Random Guess 
Assignment:
  Write a Java application that displays two dialog boxes 
  in sequence. The first asks you to think of a number between 
  1 and 10. The second displays a randomly generated number; the 
  user can see whether the guess was accurate. (After you study 
  future chapters, you will be able to improve this game so 
  that the user can enter a guess, and the program can determine 
  whether the user was correct. Also, as you gain skills in Java, you 
  will be able to tell the user how far off the guess was, tell 
  the user whether the guess was high or low, and provide a specific 
  number of repeat attempts.) Save the file as RandomGuess.java.

Program Description:
  This program is design to take user input and and compare if 
  the guess can correctly guess the number.
  
Created By: Michael Hikuleotmaufa
Date: 2025-07-15
*/

import javax.swing.JOptionPane;

public class RandomGuess {
  public static void main(String[] args) {

    JOptionPane.showInputDialog("Guess a number between 1 - 10.");

    JOptionPane.showMessageDialog(null, "The number is is " + (1 + (int) (Math.random() * 10)));
  }
}
