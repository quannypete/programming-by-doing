/*
* Counting Machine Revisited
* https://programmingbydoing.com/a/counting-machine-revisited.html
* Write a program that gets three integers from the user.
* Count from the first number to the second number in increments of the third number. 
* Use a for loop to do it.
*/

import java.util.Scanner;

public class CountingMachine2{
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  int start, end, counter;

  System.out.print("Count from: ");
  start = keyboard.nextInt();
  System.out.print("Count to: ");
  end = keyboard.nextInt();
  System.out.print("Count by: ");
  counter = keyboard.nextInt();
  System.out.println();

  for(int i = start; i <= end; i += counter){
    System.out.print(i + " ");
  }
  System.out.println();
  }
}
