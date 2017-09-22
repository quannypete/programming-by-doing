import java.util.Scanner;
public class GenerGame {
	public static void main(String[] args){
		
		
		String gender, firstname, lastname, maritalstatus;
		String formal_name;
		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your gender (M or F): ");
		gender = keyboard.next();
		System.out.println("What is your first name? ");
		firstname = keyboard.next();
		System.out.println("What is your last name? ");
		lastname = keyboard.next();
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		System.out.println(" ");
		
		if (age >= 20){
			if (gender.equals("F")){
				System.out.println("Are you married," + firstname + " (yes or no)? ");
				maritalstatus = keyboard.next();
				if (maritalstatus.equals("yes"))
					formal_name = "Mrs. " + lastname;
					else
						formal_name = "Ms. " + lastname;
			}
			else
				formal_name = "Mr." + lastname;
		}
		else
			formal_name = firstname + " " + lastname;
		System.out.println(" ");
		System.out.println( "Then I shall call you " + formal_name );
	}
}