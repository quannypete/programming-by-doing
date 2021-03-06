/*
* Dice Double
* https://programmingbydoing.com/a/dice-doubles.html
* Modify your dice game from last time so that it keeps rolling until they get doubles (the same number on both dice). 
* Notice that since there's no user input, this will happen very quickly (all the rolls will happen one right after the other).
*/

import java.util.Random;
public class DoubleDice {
	public static void main(String [] args){

		Random rand = new Random();
		int dice1 = 1 + rand.nextInt(6);
		int dice2 = 1 + rand.nextInt(6);
		int total;

		System.out.println("Here COMES THE DICE!");
		System.out.println("");


    while( dice1 != dice2){
      System.out.println("Roll #1 is: " + dice1);
  		System.out.println("Roll #2 is: " + dice2);
      total = dice1 + dice2;
  		System.out.println("The total is: " + total + "!");
      int dice3 = 1 + rand.nextInt(6);
  		int dice4 = 1 + rand.nextInt(6);
      dice1 = dice3;
      dice2 = dice4;
    }
    System.out.println("You rolled doubles!");
    System.out.println("Roll #1 is: " + dice1);
    System.out.println("Roll #2 is: " + dice2);
    total = dice1 + dice2;
    System.out.println("The total is: " + total + "!");

	}

}
