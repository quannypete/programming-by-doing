/*
* Finding a Value in an Array
* https://programmingbydoing.com/a/finding-a-value-in-an-array.html
* Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
* Display those values on the screen, and then prompt the user for an integer. 
* Search through the array, and if the item is present, say so.
* It is not necessary to display anything if the value was not found.  
* If the item is in the array multiple times, it's okay if the program prints the message more than once.
*/

import java.util.Scanner;
import java.util.Random;

public class  FindingAValue{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int searchkey;

    int [] arr = new int[10];

    System.out.print("Array 1: ");
    for(int i = 0; i < arr.length; i++){
      arr[i] = 1 + rand.nextInt(50);
      System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Value to find: ");
    searchkey = keyboard.nextInt();

    for(int i = 0; i < arr.length;i++){
      if(searchkey == arr[i]){
        System.out.println(searchkey + " is in the array.");
      }
    }

  }
}
