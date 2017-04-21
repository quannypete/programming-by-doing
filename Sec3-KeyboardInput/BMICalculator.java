import java.util.Scanner;
public class BMICalculator {
	public static void main(String [] args){
		/**
		 * BMI Calculator
		 * http://programmingbydoing.com/a/bmi-calculator.html
		 * The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in
		 * populations.
		 * It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height
		 * in meters.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		double height;
		double weight;
		double BMI;
		
		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();
		System.out.print("Your weight in kg: ");
		weight = keyboard.nextDouble();
		
		BMI = weight / (height * height);
		System.out.println("Your BMI is " + BMI);
		
		
	}

}
