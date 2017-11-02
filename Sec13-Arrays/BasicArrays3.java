/*
* Basic Arrays 3
* https://programmingbydoing.com/a/basic-arrays-3.html
* Create an array that can hold 1000 integers.
* Fill the array with random numbers in the range 10-99.
* Then display the contents of the array on the screen.
* You must use a loop.
*/

import java.util.Random;
public class BasicArrays3{
  public static void main(String[] args){
	int a[]=new int[1000];
  int Low = 10;
  int High = 100;
	Random r = new Random();

	for(int i=0; i<a.length; i++){
    int x = r.nextInt(High - Low) + Low;
		a[i] = x;
		System.out.print(a[i]+"\t");
	}
	}
}
