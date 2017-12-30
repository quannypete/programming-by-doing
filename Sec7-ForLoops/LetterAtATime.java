import java.util.Scanner;

public class LetterAtATime{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    String message;

    System.out.print("What is your message? ");
    message = keyboard.nextLine();

    System.out.println("\nYour message is "+ message.length() + " characters long." );
    System.out.println("The first character is at position 0 and is " + message.charAt(0) + ".");
    int lastLetter = message.length()-1;
    System.out.println("The last character is at position " + message.length() + " and is " + message.charAt(lastLetter) + ".");
    System.out.println("");

    System.out.println("Here are all the letters, one at a time");
    for(int i = 0; i <= lastLetter; i++){
      System.out.println(i + " - '" + message.charAt(i) + "'");
    }
  }
}
