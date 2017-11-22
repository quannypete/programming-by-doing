/*
* Adding Values in a Loop
* https://programmingbydoing.com/a/adding-values-in-a-loop.html
* Write a program that gets several integers from the user.
* Sum up all the integers they give you.
* Stop looping when they enter a 0.
* Display the total at the end.
* You must use a while loop.
*/

import java.util.Scanner;
public class AddingValues{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int number;
    int total = 0;

    System.out.println("I will add up the numbers you give me.");
    System.out.print("Number: ");
    number = keyboard.nextInt();

    while(number != 0){
      total += number;
      System.out.println("The total so far is " + total);
      System.out.print("Number: ");
      number = keyboard.nextInt();
    }
    System.out.println("The total is " + total);
  }
}
