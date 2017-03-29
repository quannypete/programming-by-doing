
public class YourSchedule {
	public static void main(String [] args) {
	/**
	 * 	https://programmingbydoing.com/a/your-schedule.html
	 * Use several variables to store the names of your classes and their teachers. Then, display a nice little table
	 * displaying your schedule. Just FYI, my column of courses has a width of 26 characters, and the teacher column has
	 * a width of 15. The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.
	 * Your table doesn't need to look exactly like this, or even line up. I used a total of sixteen variables (course1,
	 * course2, ... course8, teacher1, teacher2, etc.). You should do the same.
	 */
		
		String course1 = "English";
		String course2 = "Calculus";
		String course3 = "US History";
		String course4 = "Biology";
		String course5 = "Team Sports";
		String course6 = "Computing";
		String teacher1 = "Mr. Wayne";
		String teacher2 = "Mrs. Greene";
		String teacher3 = "Ms. Poltridge";
		String teacher4 = "Ms. Tinson";
		String teacher5 = "Mr. Graham";
		String teacher6 = "TBA";
		
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 1 |              " + course1 + "        |       " + teacher1 + "          |");
        System.out.println("| 2 |             " + course2 + "        |     " + teacher2 + "          |");
        System.out.println("| 3 |           " + course3 + "        |   " + teacher3 + "          |");
        System.out.println("| 4 |              " + course4 + "        |      " + teacher4 + "          |");
        System.out.println("| 5 |          " + course5 + "        |      " + teacher5 + "          |");
        System.out.println("| 6 |            " + course6 + "        |             " + teacher6 + "          |");
        System.out.println("+------------------------------------------------------------+");
	}
}
