/*
* Basic Arrays 1
* https://programmingbydoing.com/a/basic-arrays-1.html
* Create an array that can hold ten integers. Fill up each slot of the array with the number -113. 
* Then display the contents of the array on the screen.
* This time, you must use a loop, to put the values in the array and also to display them.
* Also, in the condition of your loop, you should not count up to a literal number.
* Instead you should use the length field of your array.
*/

public class BasicArrays1 {
  public static void main(String[] args) {

    int [] arr = new int[10];  // Declares and creates the array
    int slot = 0; // Declares and creates the slot variable

    for (int i=0; i<arr.length; i++ ){ //initializes the array and sets every element in the array equal to -113
      arr[i] = -113;
    }
    for(int i = 0; i <arr.length; i++ ){ //prints out the array
      System.out.println("Slot "+ slot + " contains a " + arr[i]);
      j++;
    }
  }

}
