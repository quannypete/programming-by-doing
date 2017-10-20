import java.util.Scanner;
import java.util.Random;
public class ThreeCountMonte {
	public static void main(String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int answer = 1 + rand.nextInt(3);
		int choice;
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");
		System.out.println("");
		System.out.println("Which one is the ace?");
		System.out.println("");
		System.out.println("\t\t##	##	##");
		System.out.println("\t\t##	##	##");
		System.out.println("\t\t1	2	3");
		System.out.println("");
		System.out.print(">");
		choice = keyboard.nextInt();
		System.out.println("");
		
		if (choice != answer){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + answer +".");
			if( answer == 1){
				System.out.println("\t\tAA	##	##");
				System.out.println("\t\tAA	##	##");
				System.out.println("\t\t1	2	3");
			}
			else if (answer == 2){
				System.out.println("\t\t##	AA	##");
				System.out.println("\t\t##	AA	##");
				System.out.println("\t\t1	2	3");
			}
			else{
				System.out.println("\t\t##	##	AA");
				System.out.println("\t\t##	##	AA");
				System.out.println("\t\t1	2	3");
			}
		}
			else {
				System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				if( answer == 1){
					System.out.println("\t\tAA	##	##");
					System.out.println("\t\tAA	##	##");
					System.out.println("\t\t1	2	3");
				}
				else if (answer == 2){
					System.out.println("\t\t##	AA	##");
					System.out.println("\t\t##	AA	##");
					System.out.println("\t\t1	2	3");
				}
				else{
					System.out.println("\t\t##	##	AA");
					System.out.println("\t\t##	##	AA");
					System.out.println("\t\t1	2	3");
					}
				}
		}
	}
