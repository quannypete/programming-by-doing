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
