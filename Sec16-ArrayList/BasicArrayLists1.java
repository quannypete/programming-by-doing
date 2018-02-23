/*
* Basic ArrayLists 1
* https://programmingbydoing.com/a/basic-arraylists-1.html
* Create an ArrayList that can hold Integers.
* Add ten copies of the number -113 to the ArrayList. 
* Then display the contents of the ArrayList on the screen..
* This time, you must use a loop, both to fill up the ArrayList and to display it.
* Also, in the condition of your loop, you should not count up to a literal number. 
* Instead you should use the size() of your ArrayList.
*/

import java.util.ArrayList;

public class Test {

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

		for (int i = 0; i < al.size(); i++) {
			slot = i;
			System.out.println("Slot " + slot + " contains a " + al.get(i));

		}

	}
}
