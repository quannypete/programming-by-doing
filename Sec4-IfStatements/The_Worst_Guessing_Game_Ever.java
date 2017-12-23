/**
* The Worst Number-Guessing Game Ever
* https://programmingbydoing.com/a/the-worst-number-guessing-game-ever.html 
* Write a program that plays an incredibly stupid number-guessing game. 
* The user will get one try to guess the secret number Tell them if they got it right or wrong, and if they got it wrong, display what the secret number was.
* You must store the secret number in a variable, and use that variable throughout. 
*The secret number itself must not appear in the program at all, except in the one line where you store it into a variable.
**/

import java.util.Scanner;
public class The_Worst_Guessing_Game_Ever {
	public static void main(String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		int secret_number = 4;
		int guess;
		
		System.out.println("THE WORST NUBMER GESSING GAME EVAR!!!!!!!!!");
		System.out.println("");
		System.out.println("I'M THKING OF A NUM FROM 1-10.  TRY 2 GuESS! ");
		guess = keyboard.nextInt();
		
		if( guess == secret_number){
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secret_number + "!");
		}
		else{
			System.out.println("NOPE, BETTER LUCK NEXT TIME.");
		}
	}

}
