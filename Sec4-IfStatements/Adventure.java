/**
* Choose Your Own Adventure!
* http://programmingbydoing.com/a/choose-your-own-short-adventure.html
* Make a short "Choose Your Own Adventure" game. 
* The starting room should give the user two choices.
* Then the second room they travel to should give them two more choices. 
* Finally the third room should give them two choices.
*/

import java.util.Scanner;
public class Adventure {
	public static void main(String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		String room, choice1, choice2;
		
		System.out.println("Welcome to Quanny's tiny adventure!");
		System.out.println("");
		System.out.println(" You enter your workplace after hours and hear a stange noise!  Would you like to investigate \nthe \"office\"  or the \"factory\"?" );
		System.out.print("> ");
		room = keyboard.next();
		System.out.println("");
		
		if (room.equals("office")){
			System.out.println("The office area is dark but as you gaze around you notice something amiss. The door to the \nconference room is open. But you could have sworn the closet door was closing as you entered. \nYou may go in the  \"conference room\" or open the \"closet\" ");
			System.out.print("> ");
			choice1 = keyboard.next();
			if (choice1.equals("conference room")){
				System.out.println("A masked gunman jumps up from under the table. He shoots you then flees! As you lay there \ndying you wished you eat that choclate pudding cake this morning");
			}
			else{
				System.out.println("You open the closet and a mose runs out. Making you scream \"AAAAH!\" ");
			}
		}
		else if (room.equals("factory")){
			System.out.println("You get to the door of the factory and gase down the staris. Do you go down the \"stairs\" \n or think nope this is creepy and close the \"door\" to the factory?");
			System.out.print("> ");
			choice2 = keyboard.next();
			if(choice2.equals("stairs")){
				System.out.println("There was nothing down there. But on your way back up the stairs you trip and fall to your death.");	
			}
			else{
				System.out.println("You closed the door unknown to you at the time the factory was being robbed.");
			}
		}
	}

}
