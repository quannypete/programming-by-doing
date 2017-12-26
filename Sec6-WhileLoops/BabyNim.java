import java.util.Scanner;

public class BabyNim{
  public static void main(String[] args) {
    int first = 3;
    int second = 3;
    int third = 3;
    int remove;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("A: 3\t	B: 3\t	C: 3");

    while(first >0 || second >0 || third >0){
      System.out.println("Choose a pile: ");
      String pile = keyboard.next();
      if(pile.equals("A")){
        System.out.println("How many to remove from pile A: ");
        remove = keyboard.nextInt();
        first = first - remove;
        System.out.println("A:" + first +"\tB: " + second + "\tC: " + third);
      }
       if(pile.equals("B")){
        System.out.println("How many to remove from pile B: ");
        remove = keyboard.nextInt();
        second = second - remove;
        System.out.println("A:" + first +"\tB: " + second + "\tC: " + third);
      }
     if(pile.equals("C")){
        System.out.println("How many to remove from pile C: ");
        remove = keyboard.nextInt();
        third = third - remove;
        System.out.println("A:" + first +"\tB: " + second + "\tC: " + third);
      }
    }
    System.out.println("All piles are empty. Good job!");
  }
}
