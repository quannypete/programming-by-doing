import java.util.Scanner;

public class  AddingValuesWithAForLoop {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int sum = 0;

    System.out.print("Number: ");
    int countTo = keyboard.nextInt();
    System.out.println("");

    for(int i = 1; i <= countTo; i++){
      System.out.print(i + " ");
      sum += i;
    }

    System.out.println("\nThe sum is " + sum + ".");

  }
}
