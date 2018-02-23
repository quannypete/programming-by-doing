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

		for (int i = 0; i < al.size(); i++) {
			slot = i;
			System.out.println("Slot " + slot + " contains a " + al.get(i));

		}

	}
}
