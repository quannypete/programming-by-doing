/*
* Letter at a Time
* https://programmingbydoing.com/a/letter-at-a-time.html
* Did you know that using a loop, you can examine a String one letter at a time? 
* The two key built-in String methods are length() and charAt().
* length() returns an int representing the total number of characters in the String (including punctuation and whitespace).
* For example, if the variable str contains the String "hello", then str.length() will return 5.
* charAt( int n ) returns the  nth character (char) in the String.
* The character positions are zero-based, so if the variable str contains the String "ligature", then str.charAt(0) will return 'l', and str.charAt(4) will return 't'.
*/

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
