/**
* Modify your incredibly stupid number-guessing game to actually pick a random
* number from 1 to 10 and have the user try to guess that. Tell them if they get it
* right or wrong, and if they get it wrong, show them what the random number was.
* They will still only get one try.
*/
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
	public static void main(String [] args){

		Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
		int secret_number = 1 + rand.nextInt(10) ;
		int guess;

		System.out.println("THE WORST NUBMER GESSING GAME EVAR!!!!!!!!!");
		System.out.println("");
		System.out.println("I'M THKING OF A NUM FROM 1-10.  TRY 2 GuESS! ");
		guess = keyboard.nextInt();

		if( guess == secret_number){
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secret_number + "!");
		}
		else{
			System.out.println("Sorry, but I was really thinking of. " + secret_number + ".");
		}
	}

}
