/**
* Two More Questions
* http://programmingbydoing.com/a/two-more-questions.html
* Using if statements with compound conditions (like &&), make a guessing game of two questions similar to the Twenty Questions assignment.
* However, this time you must accomplish it using if statements with compound conditions and you must not use else if or else or nested ifs.
* - Question 1: Does it belong inside or outside or both?
* - Question 2: Is it alive?
* Again, here are some sample responses, for the non-creative among you.
* inside	        outside	    both
* alive	    houseplant	    bison	    dog
* not alive	shower curtain	billboard	cell phone
 */

import java.util.Scanner;
public class Two_More_Questions {
	public static void main( String[] args){
		Scanner keyboard= new Scanner(System.in);
		String q1;
		String q2;
		
		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println("");
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println("");
		
		System.out.print("Question 1) Does it stay inside or outside or both? ");
		q1 = keyboard.next();
		System.out.print("Question 2) Is it a living thing? ");
		q2 = keyboard.next();
		
		if (q1.equals("inside") && q2.equals("yes") ){
			System.out.println("You must be thinking of a houseplant, right?.");
			}
		else if (q1.equals("inside") && q2.equals("no") ){
			System.out.println("You must be thinking of that ugly shower curtain, I hate it too.");
		}
		else if (q1.equals("outside") && q2.equals("yes") ){
			System.out.println("You must be thinking of my favorite animal, the Bison!");
		}
		else if (q1.equals("outside") && q2.equals("no") ){
			System.out.println("You must be thinking of that billboard we past the other day.");
		}
		else if (q1.equals("both") && q2.equals("yes") ){
			System.out.println("You must be thinking of your dog Toto. Toto is so adorable.");
		}
		else if(q1.equals("both") && q2.equals("no") ){
			System.out.println("Why are you thinking of your phone.I swear you can't live without that thing.");
		}
		
	}
}
