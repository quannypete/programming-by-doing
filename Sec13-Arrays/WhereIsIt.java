/*
* Where Is It?
* hhttps://programmingbydoing.com/a/where-is-it.html
* Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
* Display those values on the screen, and then prompt the user for an integer.
* Search through the array, and if the item is present, give the slot number where it is located.
* If the value is not in the array, display a single message saying so.
* Just like the previous assignment, if the value is present more than once, you may display the message as many times as necessary.
*/

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt{

  public static void main(String[] args) {

    int [] myarr = new int [10];
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int target;
    boolean isPresent = false;
    Integer slot = null;

    System.out.println("Array: ");
    for(int i=0; i < myarr.length; i++){
      int x = rand.nextInt(50);
      myarr[i] = x;
      System.out.print(myarr[i] + " ");
    }

    System.out.print("\nValue to find: ");
     target = scan.nextInt();

     System.out.println(" ");

     for(int i = 0; i < myarr.length; i++){

       if( target == myarr[i]){
         isPresent = true;
         slot = i;
       }

     }
     if(isPresent == true){
       System.out.println(target + " is in slot " + slot);
     }
     else{
       System.out.println(target + " is not in the array.");
     }


  }
}
