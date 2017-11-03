/*
* How Many Times?
* https://programmingbydoing.com/a/how-many-times.html
* Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
* Display those values on the screen, and then prompt the user for an integer. 
* Search through the array, and count the number of times the item is found.
*/


import java.util.Scanner;
import java.util.Random;

public class  HowMany{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int searchkey;
    int found = 0;

    int [] arr = new int[10];

    System.out.print("Array 1: ");
    for(int i = 0; i < arr.length; i++){
      arr[i] = 1 + rand.nextInt(50);
      System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Value to find: ");
    searchkey = keyboard.nextInt();
    System.out.println(" ");

    for(int i = 0; i < arr.length;i++){
      if(searchkey == arr[i]){
        found++;
      }
    }
    System.out.println(" ");
    System.out.println(searchkey + " was found "  + found + " times");
  }
}
