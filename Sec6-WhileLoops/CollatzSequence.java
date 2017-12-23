/*
* Collatz Sequence
* https://programmingbydoing.com/a/collatz-sequence.html
* Take any natural number n.
* If n is even, divide it by 2 to get n / 2.
* If n is odd, multiply it by 3 and add 1 to get 3n + 1.
* Repeat the process indefinitely.
* In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1.
* This is widely believed to be true, but has never been formally proved.
* Write a program that inputs a number from the user, and then displays the Collatz Sequence starting from that number. 
* Stop when you reach 1.
*/

import java.util.Scanner;
public class CollatzSequence{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int steps = 0;
    int max = 0;

    System.out.print("Starting number: "  );
    int n = keyboard.nextInt();
    System.out.println();

  while(n  != 1){
    if(n % 2 == 0){
      n = n / 2;
    }
    else{
      n = (3 * n ) + 1;
    }
    if (n > max){
      max = n;
    }
    steps++;
    System.out.print(n + "\t");
  }
  System.out.println();
  System.out.println("Terminated after " +steps + " steps.");
  System.out.println("The largest value was " + max + ".");
  }
}
