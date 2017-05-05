import java.util.Scanner;
public class AlittleQuiz {
	public static void main(String [] args){
		
		
		int Q1, Q2, Q3, score = 0;
		String start;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Are you ready for a quiz? ");
		start = keyboard.next();
		System.out.println("Okay, here it comes!");
		System.out.println("");
		System.out.println("Q1) What is 2 * 6?");
		System.out.println(" \t 1) 3");
		System.out.println(" \t 2) 12");
		System.out.println(" \t 3) 4");
		System.out.print("> ");
		Q1 = keyboard.nextInt();
		if (Q1 == 2){
			System.out.println("Awesome job!");
			score++;
		}
		else if (Q1 == 1){
			System.out.println("Sorry, 6 / 2 = 3");
		}
		else if (Q1 == 3){
			System.out.println("Incorrect! 6 - 2 = 4");
		}
		else
			System.out.println("Invalid response.");
		System.out.println("");
		
		System.out.println("Q2) What is the capitol of Texas?");
		System.out.println("\t 1) Austin");
		System.out.println("\t 2) Helena");
		System.out.println("\t 3) Olympia");
		System.out.print("> ");
		Q2 = keyboard.nextInt();
		if (Q2 == 1){
			System.out.println("That is Correct");
			score++;
		}
		else if (Q2 == 2){
			System.out.println("Helena is the capital of Montana.");
		}
		else if (Q2 == 3){
			System.out.println("Olympia is in Washington.");
		}
		else
			System.out.println("Invalid response.");
		System.out.println("");
		
		System.out.println("Q3) Can you store the value \"Cat\" in a varible type int?");
		System.out.println("\t 1) yes");
		System.out.println("\t 2) no"); 
		System.out.print("> ");
		Q3 = keyboard.nextInt();
		if (Q3 == 1){
			System.out.println("Sorry, \"Cat\" is a string, int can only store numbers ");
		}
		else if (Q3 == 2){
			System.out.println("That's right!");
			score++;
		}
		System.out.println("");
		
		System.out.println("Overall, you got " + score + " out of 3 correct.");
		System.out.println("Thanks for playing!");
	}

}
