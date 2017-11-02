public class BasicArray1 {
  public static void main(String[] args) {

    int [] arr = new int[10];
    int j = 0;

    for (int i=0; i<arr.length; i++ ){
      arr[i] = -113;
    }
    for(int i = 0; i <arr.length; i++ ){
      System.out.println("Slot "+ j + " contains a " + arr[i]);
      j++;
    }
  }

}
