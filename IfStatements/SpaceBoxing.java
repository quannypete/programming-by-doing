import java.util.Scanner;
public class SpaceBoxing {
	public static void main(String [] args){
		
		/**
		 * Space Boxing
		 * http://programmingbydoing.com/a/space-boxing.html
		 * Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts for various
		 * weight categories on many different planets within our solar system. However, it is often difficult for him to recall
		 * what his "target weight" needs to be on earth in order to make the weight class on other planets. Write a program to
		 * help him keep track of this.
		 * It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on. It should then
		 * compute his weight on the destination planet based on the table below:
		 * #	Planet	Relative gravity
		 * 1	Venus	0.78
		 * 2	Mars	0.39
		 * 3	Jupiter	2.65
		 * 4	Saturn	1.17
		 * 5	Uranus	1.05
		 * 6	Neptune	1.23
		 * So, for example, if Julio weighs 128 lbs. on earth, then he would weigh just under 50 lbs. on Mars, since Mars'
		 * gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)
		 */
		
		int earthweight, planet;
		double planetweight =0.00;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter your current earth weight: ");
		earthweight= keyboard.nextInt();
		System.out.println("");
		System.out.println("I have information for the follwoing planets:");
		System.out.println("1. Venus   2. Mars     3. Jupiter");
		System.out.println("4. Saturn  5. Uranus   6. Neptune");
		System.out.println("");
		System.out.print("Which planet are you visiting? ");
		planet = keyboard.nextInt();
		System.out.println("");
		if(planet == 1){
			planetweight = earthweight * 0.78;
		}
		else if (planet == 2){
			planetweight = earthweight * 0.39;
		}
		else if (planet == 3){
			planetweight = earthweight * 2.65;
		}
		else if (planet == 4){
			planetweight = earthweight * 1.17;
		}
		else if (planet == 5){
			planetweight = earthweight * 1.05;
		}
		else if (planet == 6){
			planetweight = earthweight * 1.23;
		}
		else
		{
			System.out.println("Not a valid planet.");
		}
		System.out.println("Your weight would be "+ planetweight + " pounds on that planet.");
	}
}

