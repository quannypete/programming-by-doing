/**
* Using Variables
* http://programmingbydoing.com/a/using-variables.html
* Write a program that creates three variables: an int, a double, and a String.
* Put the value 113 into the first variable, the value 2.71828 into the second, and the value "Computer Science" into
* the third. It does not matter what you call the variables... this time.
* Then, display the values of these three variables on the screen, one per line.
* You must use three variables. Your program will probably have nine lines of code inside the curly braces of main().
*/

public class UsingVariables {
	public static void main( String[] args){
	
		int a= 113;
		double b=  2.71828;
		String subject= "Computer Science";
		
		System.out.println("This is room number # " + a);
		System.out.println("e is close to " + b);
		System.out.println("I am learn a bit about "+ subject);
	}
}
