/*
* Counting Machine
* https://programmingbydoing.com/a/counting-machine.html
* Write a program that gets an integer from the user.
* Count from 0 to that number.
* Use a for loop to do it.
*/

import java.util.Scanner;

public class CountingMachine{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int number;

    System.out.print("Count to: ");
    number = keyboard.nextInt();
    System.out.println("");

    for(int i=0; i <= number; i++){
      System.out.print(i + " ");
    }
    System.out.println("");
  }
}
