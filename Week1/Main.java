/* 
 Program Name: Main
 Description:
  This is my first Java program, where I learn how to create
  'print' and 'println' statements. In addition, I am learning how
  to code, compile, and execute files in Java. Fun fact, this process
  is similar during my time when I was learning C. Lastly, I am learning
  syntax of Java to better be familiarzed with this programming language.

  Programming will be fun since I will be programming in NeoVim/ NVChad.
  Lastly, I had finished installing LSP and TreeSitters for Java and 
  Python.

 Name: Michael Hikuleomtaufa
 Date: 2025-07-12
*/


public class Main{ 
  public static void main(String[] args){

    // Declaring int variables to experiment
    int age = 30;
    int year = 2025;
    int fruitQuantity = 10;

    // Declaring double variables to experiment. Doubles are int, but with decimals.
    double fruitPrice = 2.99;
    double carPrice = 40000.99;

    // Char are single characters with single quotes
    char USDcurrency = '$';
    char grade = 'A';

    // Boolean are true or false
    boolean isSeniorCitizen = true;

    // Strings are strings with double quotes
    String name = "Michael";
    String greeting = "Good Afternoon";


    System.out.println("Hello World!");
    System.out.println("My name is Michael and I am " + age + " years old.");
    System.out.println("I am learning how to program in Java in " + year + ".");
    System.out.println("I want to buy a " + year + " Mustang that cost " + carPrice);


    if (isSeniorCitizen){
      System.out.println("Congratulations, you are eligible for Senior Citizen Discount.");
    }
    else{
      System.out.println("Sorry, you are not eligible for Senior Citizen Discount.");
    }
  } 
}
