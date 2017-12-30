public class XsAndYs{
public static void main(String[] args) {
  double increaseBy = 0.5;

  System.out.println("x\ty");
  System.out.println("----------------");

  for(double i = -10; i <= 10; i += increaseBy){
    double y = i * i;
    System.out.println(i + "\t"+ y);
  }
}
}
