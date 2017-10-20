/*
* Fortune Cookie
* https://programmingbydoing.com/a/fortune-cookie.html
* Write a program that simulates a random fortune from a fortune cookie. 
* You must have at least six fortunes.
* For bonus points, also add randomly-chosen lotto numbers to the fortune. 
* In Texas, the lotto chooses 6 numbers, each from 1-54.
*/
import java.util.Random;

public class FortuneCookie
{
	public static void main( String[] args )
	{

		Random rand = new Random();

		int fortune = 1 + rand.nextInt(6);
		String response = " ";

		int num = 1 + rand.nextInt(54);

		if (fortune == 1 )
			response = "Good Things comes to those who wait.";
		else if (fortune == 2 )
				response = "You will run into an old friend.";
		else if (fortune == 3 )
				response = "True love is on its way. Make room!";
		else if ( fortune == 4 )
					response = "Focus on your health and well-being now. It won't wait.";
		else if (fortune == 5 )
					response = "Respect your elders. You could inherit a large sum of money.";
		else
			response = "Work with what you have.";

		System.out.println("Fortune cookie says: " + response );

		System.out.print("   ");
        System.out.print(1 + rand.nextInt(54));
        System.out.print(" - ");
        System.out.print(1 + rand.nextInt(54));
        System.out.print(" - ");
        System.out.print(1 + rand.nextInt(54));
        System.out.print(" - ");
        System.out.print(1 + rand.nextInt(54));
        System.out.print(" - ");
        System.out.print(1 + rand.nextInt(54));
        System.out.print(" - ");
        System.out.print(1 + rand.nextInt(54));

	}
}
