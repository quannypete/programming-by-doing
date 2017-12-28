import java.util.Scanner;

public class CountingMachine2{
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);

  int start, end, counter;

  System.out.print("Count from: ");
  start = keyboard.nextInt();
  System.out.print("Count to: ");
  end = keyboard.nextInt();
  System.out.print("Count by: ");
  counter = keyboard.nextInt();
  System.out.println();

  for(int i = start; i <= end; i += counter){
    System.out.print(i + " ");
  }
  System.out.println();
  }
}
