/*
* Write a program that picks a random number from 1-100. Give the user a chance to guess 
* it. If they get it right, tell them so. If their guess is higher than the number, say 
* "Too high." If their guess is lower than the number, say "Too low." Then quit. (They 
* don't get any more guesses for now.)
*/
import java.util.Scanner;
import java.util.Random;
public class Hi_Lo {
	public static void main( String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int guess, number;
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it");
		System.out.print("> ");
		guess = keyboard.nextInt();
		System.out.println("");
		
		number = 1 + rand.nextInt(100);
		
		if( guess < number){
			System.out.println("Sorry, you are too low. I was thinking of " + number + ".");
		}
		else if (guess > number){
			System.out.println("Sorry, you are too high. I was thinking of " + number + ".");
		}
		else{
			System.out.println("You guessed it! What are the odds?!?");
		}
		
	}

}
