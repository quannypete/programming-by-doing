/*
* Finding the Largest Value in an Array
* https://programmingbydoing.com/a/finding-the-largest-value-in-an-array.html
* Create an array that can hold ten integers, and fill each slot with a different random value from 1-10.
* Display those values on the screen. 
* Then use a linear search to find the largest value in the array, and display that value.
*/

import java.util.Random;

public class LargestValue{

  public static void main(String[] args) {

    int [] myarr = new int[10];
    Random rand = new Random();
    int max = 0;

    System.out.print("Array: ");

    for(int i = 0; i <myarr.length; i++){
      myarr[i] = rand.nextInt(100);

      if(myarr[i] > max){
        max = myarr[i];
      }
      System.out.print(myarr[i] + " ");
    }

    System.out.println("\nThe largest value is " + max);
  }
}
