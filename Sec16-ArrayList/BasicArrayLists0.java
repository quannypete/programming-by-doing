/*
* Basic ArrayLists 0
* https://programmingbydoing.com/a/basic-arraylists-0.html
* Create an ArrayList that can hold Integers.
* Add ten copies of the number -113 to the ArrayList. 
* Then display the contents of the ArrayList on the screen..
* Do not use a loop. 
* Also, do not use any variable for the index; you must use literal numbers to refer to each slot.
*/

import java.util.ArrayList;

public class BasicArrayLists0 {

	public static void main(String[] args) {

		int slot;

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);
		al.add(-113);

		System.out.println("Slot 0 contains a " + al.get(0));
		System.out.println("Slot 1 contains a " + al.get(1));
		System.out.println("Slot 2 contains a " + al.get(2));
		System.out.println("Slot 3 contains a " + al.get(3));
		System.out.println("Slot 4 contains a " + al.get(4));
		System.out.println("Slot 5 contains a " + al.get(5));
		System.out.println("Slot 6 contains a " + al.get(6));
		System.out.println("Slot 7 contains a " + al.get(7));
		System.out.println("Slot 8 contains a " + al.get(8));
		System.out.println("Slot 9 contains a " + al.get(9));

		}

	}
}
