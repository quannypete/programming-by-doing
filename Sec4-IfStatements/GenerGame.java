/**
* Gender Game
* https://programmingbydoing.com/a/gender-game.html
* Make a program which displays an appropriate name for a person, using a combination of nested ifs and compound conditions.
* Ask the user for a gender, first name, last name and age.
* If the person is female and 20 or over, ask if she is married.
* If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. 
* If the female is under 20, display her first and last name.
* If the person is male and 20 or over, display "Mr." in front of his name.
* Otherwise, display his first and last name.
* Note that asking a person if they are married should only be done if they are female and 20 or older, which means you will have a single if and else nested inside one of your if statements.
*/

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
