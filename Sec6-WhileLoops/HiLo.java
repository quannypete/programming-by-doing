/*
* Hi-Lo with Limited Tries
* https://programmingbydoing.com/a/hi-lo-with-limited-tries.html
* Write a program that picks a random number from 1-100.
* The user keeps guessing as long as their guess is wrong, and they've guessed less than 7 times. 
* If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low."
* If their guess is lower than the number, say "Too low."
* When they get it right, the game stops. Or, if they hit seven guesses, the game stops even if they never got it right.
* This means your while loop will have a compound condition using &&.
*/

import java.util.Scanner;
import java.util.Random;

public class HiLo{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();

    int guess, number, tries;
    number = 1 + rand.nextInt(100);
    tries = 1;

    System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
    System.out.println("First guess: ");
    guess = keyboard.nextInt();
    tries++;

    while(guess != number && tries < 7){
      if(guess < number){
        System.out.println("Sorry, you are too low.");
      }
      if(guess > number){
        System.out.println("Sorry, you are too high.");
      }
      tries++;
      System.out.println("Guess #" + tries + ": ");
      guess = keyboard.nextInt();
    }
    if ( guess != number ) {
      System.out.println( "Sorry, you didn't guess it in 7 tries. You lose." );
    }
    if ( guess == number ) {
      System.out.println( "Wow, you got it in only " + tries + " tries! What are the odds!" );
    }
  }
}
