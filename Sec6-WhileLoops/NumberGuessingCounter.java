/*
* Number-Guessing with a Counter
* https://programmingbydoing.com/a/number-guessing-with-a-counter.html
* Modify your previous number-guessing game so that they can guess until they get it right AND count the number of tries it takes them to guess it. 
* They will still only get one try.
*/

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingCounter{
  public static void main(String [] args){

    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();

    int guess, number, tries;
    number = 1 + rand.nextInt(10);
    tries = 0;

    System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
    System.out.println("Your guess: ");
    guess = keyboard.nextInt();
    tries++;

    while( guess != number)
    {
      System.out.println("\nThat is incorrect.  Guess again.");
      System.out.println("Your guess: ");
      guess = keyboard.nextInt();
      tries++;
    }
    if(guess == number){
      System.out.println("That's right!  You're a good guesser.");
      System.out.println("It only took you " + tries + " tries.");
    }

  }
}
