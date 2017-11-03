import java.util.Scanner;
import java.util.Random;

public class  HowMany{
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int searchkey;
    int found = 0;

    int [] arr = new int[10];

    System.out.print("Array 1: ");
    for(int i = 0; i < arr.length; i++){
      arr[i] = 1 + rand.nextInt(50);
      System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Value to find: ");
    searchkey = keyboard.nextInt();
    System.out.println(" ");

    for(int i = 0; i < arr.length;i++){
      if(searchkey == arr[i]){
        System.out.println(searchkey + " is in the array.");
        found++;
      }
    }
    System.out.println(" ");
    System.out.println(searchkey + " was found "  + found + " times");
  }
}
