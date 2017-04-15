import java.util.Scanner;
public class MoreUserInputofData {
	public static void main(String [] args){
		/**
		 * More User Input of Data
		 * http://programmingbydoing.com/a/more-user-input-of-data.html
		 * Ask the user for several pieces of information, and display them on the screen afterward as a summary.
		 * - first name
		 * - last name
		 * - grade (classification)
		 * - student id number
		 * - login name
		 * - GPA (0.0 to 4.0)
		 * You must use the most appropriate type for each variable and not just Strings for everything.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		String first_name;
		String last_name;
		int grade;
		int studentid;
		String login;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for profit!");
		System.out.println();
		System.out.print("First name: ");
		first_name = keyboard.next();
		System.out.print("Last name: ");
		last_name = keyboard.next();
		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();
		System.out.print("Student ID: ");
		studentid = keyboard.nextInt();
		System.out.print("Login: ");
		login = keyboard.next();
		System.out.print("GPA (0.0-4.0): ");
		gpa = keyboard.nextDouble();
		System.out.println();
		System.out.println("Your information:");
		System.out.println("Login: " + login);
		System.out.println("ID: " + studentid);
		System.out.println("Name: " + last_name + ", " + first_name);
		System.out.println("GPA: " + gpa);
		System.out.println("Grade: " + grade);
	}

}
