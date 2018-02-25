import java.util.Random;

public class LargestValue{

  public static void main(String[] args) {

    int [] myarr = new int[10];
    Random rand = new Random();
    int max = 0;

    System.out.print("Array: ");

    for(int i = 0; i <myarr.length; i++){
      myarr[i] = rand.nextInt(100);

      if(myarr[i] > max){
        max = myarr[i];
      }
      System.out.print(myarr[i] + " ");
    }

    System.out.println("\nThe largest value is " + max);
  }
}
