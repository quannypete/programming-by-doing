/*
* Keep Guessing
* https://programmingbydoing.com/a/keep-guessing.html
* Modify your previous number-guessing game so that they can guess until they get it right. 
* That means it will keep looping as long as the guess is different from the secret number. Use a while loop.
*/

import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	public static void main( String [] args){

		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int number;

		System.out.println("I'm thinking of a number between 1-10. Try to guess it");
		System.out.print("> ");
		int guess = keyboard.nextInt();
		System.out.println("Your guess: "+ guess);

		number = 1 + rand.nextInt(10);

    while( guess != number){
      System.out.println("Incorrect now try again");
      System.out.println("Your guess: "+ guess);
      guess = keyboard.nextInt();
    }
    System.out.println("\nThat's right! You're a good guesser.");
  }
}
