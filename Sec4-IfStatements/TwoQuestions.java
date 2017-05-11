import java.util.Scanner;
public class TwoQuestions {
	public static void main(String [] args){
		
		/**
		 * Twenty Questions... well, actually just Two
		 * http://programmingbydoing.com/a/twenty-questions.html
		 * Make a program which plays a simple game of 2 Questions. The first question should be "animal, vegetable, or
		 * mineral?" Then, the second question should be "is it bigger than a breadbox?" Then, display one of six possible
		 * responses, depending on their answers. You can choose what answers to give for each of the six possibilities.
		 * Here's a suggestion:
		 * size \ type	            animal	 vegetable	mineral
		 * smaller than a breadbox	squirrel	carrot	paper clip
		 * bigger than a breadbox	moose	watermelon	Camaro
		 * You will use nested if statements to do this.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		String type, size, guess = "";
		
		System.out.println("TWO QUESTIONS?");
		System.out.println("Think of an object and I'll try to guess it.");
		System.out.println("");
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		System.out.print("> ");
		type = keyboard.next();
		System.out.println("");
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print("> ");
		size = keyboard.next();
		System.out.println("");
		
		if (type.equals("animal")) {
            if (size.equals("no")) {
                guess = "squirrel";
            } else {
                guess = "moose";
            }
        } else if (type.equals("vegetable")) {
            if (size.equals("no")) {
                guess = "carrot";
            } else {
                guess = "watermelon";
            }
        } else if (type.equals("mineral")) {
            if (size.equals("no")) {
                guess = "paper clip";
            } else {
                guess = "Camaro";
            }
        }
        if (guess == "") {
            System.out.println("The answers provided are not valid. Please try again.");
        } else {
            System.out.println("My guess is that you are thinking of a " + guess + ".");
            System.out.println("I would ask you if I'm right, but I don't actually care.");
        }
		}
	}
