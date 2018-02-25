import java.util.Random;
import java.util.Scanner;

public class WhereIsIt{

  public static void main(String[] args) {

    int [] myarr = new int [10];
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int target;
    boolean isPresent = false;
    Integer slot = null;

    System.out.println("Array: ");
    for(int i=0; i < myarr.length; i++){
      int x = rand.nextInt(100);
      myarr[i] = x;
      System.out.print(myarr[i] + " ");
    }

    System.out.print("\nValue to find: ");
     target = scan.nextInt();

     System.out.println(" ");

     for(int i = 0; i < myarr.length; i++){

       if( target == myarr[i]){
         isPresent = true;
         slot = i;
       }

     }
     if(isPresent == true){
       System.out.println(target + " is in slot " + slot);
     }
     else{
       System.out.println(target + " is not in the array.");
     }


  }
}
