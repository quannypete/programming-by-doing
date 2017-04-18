import java.util.Scanner;
public class ADumbCalculator {
	public static void main(String [] args){
	
		/**
		 * Dumb Calculator
		 * http://programmingbydoing.com/a/a-dumb-calculator.html
		 * Make a simple numeric calculator. It should prompt the user for three numbers. Then add the numbers together and
		 * divide by 2. Display the result. Your program must support numbers with decimals and not just integers.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		double first_number;
		double second_number;
		double third_number;
		double result;
		
		System.out.print("What is your first number? ");
		first_number = keyboard.nextDouble();
		System.out.print("What is your second number? ");
		second_number = keyboard.nextDouble();
		System.out.print("What is your third number? ");
		third_number = keyboard.nextDouble();
		System.out.println("");
		 result = (first_number + second_number + third_number) / 2;
		System.out.println("( " + first_number + " + " + second_number + " + " + third_number + " ) " + "/ 2 is... " + result);
	}

}
