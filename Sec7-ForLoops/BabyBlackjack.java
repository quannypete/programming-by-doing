/*
* Baby Blackjack
* https://programmingbydoing.com/a/baby-blackjack.html
* Wrrite a program that allows a human user to play a single hand of "blackjack" against a dealer.
* 1. Pick two values from 1-10 for the player. These are the player's "cards".
* 2. Pick two more values from 1-10 for the dealer.
* 3. Whoever has the highest total is the winner.
* 4. There is no betting, no busting, and no hitting. Save that for real blackjack.
*/

import java.util.Random;

public class BabyBlackjack{
  public static void main(String[] args) {
    Random rand = new Random();
    int playerCard1, playerCard2, dealerCard1, dealerCard2, sumPlayer, sumDealer;
    playerCard1 = 1 + rand.nextInt(10);
    playerCard2 = 1 + rand.nextInt(10);
    dealerCard1 = 1 + rand.nextInt(10);
    dealerCard2 = 1 + rand.nextInt(10);

    System.out.println("Baby Blackjack!");
    System.out.println(" ");

    System.out.println("You drew " + playerCard1 + " and " + playerCard2 +".");
    sumPlayer = playerCard1 + playerCard2;
    System.out.println("Your total is " + sumPlayer);

    System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2 +".");
    sumDealer = dealerCard1 + dealerCard2;
    System.out.println("Dealer's total is " + sumDealer);

    if(sumPlayer > sumDealer){
      System.out.println("You win!");
    }
    else{
      System.out.println("You lose.");
    }
  }
}
