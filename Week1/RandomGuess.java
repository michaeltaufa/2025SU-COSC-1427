/*
Program Name: Random Guess 
Assignment:

Program Description:

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
