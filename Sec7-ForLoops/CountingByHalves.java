/*
* Counting By Halves
* Write a program that uses a for loop. 
* With the loop, make the variable x go from -10 to 10, counting by 0.5. (This means that x can't be an int.)
*/

public class CountingByHalves{
public static void main(String[] args) {
  double increaseBy = 0.5;

  System.out.println("x");
  System.out.println("------");

  for(double i = -10; i <= 10; i += increaseBy){
    System.out.println(i);
  }
}
}
