/*
* Basic Arrays 2
* https://programmingbydoing.com/a/basic-arraylists-2.html
* Create an ArrayList of Integers.
* Fill up the list with ten random numbers, each from 1 to 100.  
* Then display the contents of the ArrayList on the screen.
* You must use a loop to fill up the list. 
* Also, do not use any variable for the index; you must use literal numbers to refer to each slot.
*/

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int x = rand.nextInt(100);
			al.add(x);
		}

		System.out.println("ArrayList: " + al);

	}
}

