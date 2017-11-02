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
