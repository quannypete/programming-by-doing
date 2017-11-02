/*
* Basic Arrays 2
* https://programmingbydoing.com/a/basic-arrays-2.html
* Create an array that can hold 10 integers.
*Fill up each slot of the array with a random number from 1 to 100.
* Then display the contents of the array on the screen. 
* And, like last time, you must use the length field of your array and not a literal number (like 10) in the condition of the loop.
* You must use a loop.
*/

import java.util.Random;

public class BasicArrays2 {
	public static void main(String [] args){
		
		Random rand = new Random();
		int slot = 0;
		int [] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = 1 + rand.nextInt(100);
			System.out.println("Slot " + slot + " contains a " + arr[i]);
			slot++;
		}
		
	}
}
