import java.util.Scanner;

public class CollatzSequence{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int steps = 0;
    int max = 0;

    System.out.print("Starting number: "  );
    int n = keyboard.nextInt();
    System.out.println();

  while(n  != 1){
    if(n % 2 == 0){
      n = n / 2;
    }
    else{
      n = (3 * n ) + 1;
    }
    if (n > max){
      max = n;
    }
    steps++;
    System.out.print(n + "\t");
  }
  System.out.println();
  System.out.println("Terminated after " +steps + " steps.");
  System.out.println("The largest value was " + max + ".");
  }
}
