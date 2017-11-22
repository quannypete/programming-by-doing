/*
* Shorter Double Dice
* https://programmingbydoing.com/a/shorter-double-dice.html
* Redo the Dice Doubles assignment (the dice program with a loop).
* So that it uses a do-while loop instead of a while loop.
*/

import java.util.Random;
public class ShorterDoubleDice  {
  public static void main(String[] args) {



          Random r = new Random();

          int r1, r2, total;

          System.out.println( "HERE COMES THE DICE!" );
          System.out.println();

          do {
              r1 = 1 + r.nextInt(6);
              r2 = 2 + r.nextInt(6);
              total = r1 + r2;

              System.out.println( "Roll #1: " + r1 );
              System.out.println( "Roll #2: " + r2 );
              System.out.println( "Your total is " + total + "!" );
          } while ( r1 != r2 );
      }
  }
