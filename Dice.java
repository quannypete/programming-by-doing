import java.util.Random;
public class Dice {
	public static void main(String [] args){
		
		Random rand = new Random();
		int dice1 = 1 + rand.nextInt(6);
		int dice2 = 1 + rand.nextInt(6);
		int total;
		
		System.out.println("Here COMES THE DICE!");
		System.out.println("");
		System.out.println("Roll #1 is: " + dice1);
		System.out.println("Roll #2 is: " + dice2);
		
		total = dice1 + dice2;
		System.out.println("The total is: " + total + "!");
		
		
	}

}
