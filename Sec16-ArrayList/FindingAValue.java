import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

 public class FindingAValue{

   public static void main(String[] args) {

     Random rand = new Random();
     Scanner scan = new Scanner(System.in);
     int target;


     ArrayList<Integer> al = new ArrayList<Integer>();
     for (int i =0; i < 10 ; i++ ) {
       int x = rand.nextInt(50);
       al.add(x);

     }
     System.out.println("ArrayList: " + al);

     System.out.print("Value to find: ");
     target = scan.nextInt();

     for(int i = 0; i < al.size();i++){
      if(target == i);
}
System.out.println(target + " is in the ArrayList.");
}
}
