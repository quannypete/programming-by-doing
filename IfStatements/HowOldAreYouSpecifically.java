import java.util.Scanner;
public class HowOldAreYouSpecifically {
	public static void main(String[] args){

	    String name;
	    int age;
	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Hello, What's your name? (Sorry I keep forgetting.) ");
	    name = keyboard.next();
	    System.out.println(" ");
	    System.out.print("Ok, " + name + " , how old are you? ");
	    age = keyboard.nextInt();
	    
	    if (age < 16) {
	    	System.out.println("You can't drive, " + name + " .");
	    }
	    else if (age < 17){
	    	System.out.println("You can drive but not vote, " + name + " .");
	    }
	    else if (age < 25){
	    	System.out.println("You can vote but not rent a car, " + name + " .");
	    }
	    else {
	    	System.out.println("You can do pretty much anything legal, " + name + " .");
	    }
	  }
}
