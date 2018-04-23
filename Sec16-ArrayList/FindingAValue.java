/*
* Finding a Value in an ArrayList
* https://programmingbydoing.com/a/finding-a-value-in-an-arraylist.html
* Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50. 
* Display those values on the screen, and then prompt the user for an integer.  
* Search through the ArrayList, and if the item is present, say so.
*  It is not necessary to display anything if the value was not found. 
* If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

 public class FindingAValue{

   public static void main(String[] args) {

     Random rand = new Random();
     Scanner scan = new Scanner(System.in);
     int target;


     ArrayList<Integer> al = new ArrayList<Integer>();
     for (int i =0; i < 10 ; i++ ) {
       int x = rand.nextInt(50);
       al.add(x);

     }
     System.out.println("ArrayList: " + al);

     System.out.print("Value to find: ");
     target = scan.nextInt();

     for(int i = 0; i < al.size();i++){
      if(target == i);
}
System.out.println(target + " is in the ArrayList.");
}
}
