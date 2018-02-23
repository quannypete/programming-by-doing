/*
* Is It There or Not?
* https://programmingbydoing.com/a/is-it-there-or-not.html
* Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
* Display those values on the screen, and then prompt the user for an integer.
* Search through the array, and if the item is present, say so.
* If the value is not in the array, display a single message saying so.
* Just like the previous assignment, if the value is present more than once, you may display the message as many times as necessary.
*/

import java.util.Random;
import java.util.Scanner;

public class IsItThere{

  public static void main(String[] args) {

    int [] myarr = new int [10];
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int target;

    System.out.println("Array: ");
    for(int i=0; i < myarr.length; i++){
      int x = rand.nextInt(100);
      myarr[i] = x;
      System.out.print(myarr[i] + " ");
    }

    System.out.print("\nValue to find: ");
     target = scan.nextInt();

     System.out.println(" ");

     for(int i = 0; i < myarr.length; i++){

       if( target == myarr[i]){
         System.out.println(target + " is in the array.");
         break;
       }
       else{
         System.out.println(target + " is not in the array.");
         break;
       }
     }


  }
}
