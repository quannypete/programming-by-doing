import java.util.Scanner;
public class AreaCalculator{

	private static int area_triangle( int base, int height ){
    return base * height / 2;
  }
	private static int area_rectangle( int length, int width ){
		return length * width;
	}
	private static int area_square(int side){
		return side * side;

	}
	private static double area_circle(double radius){
		return  Math.PI * Math.pow(radius, 2);
	}

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int shape = 0;

    while(shape != 5){
	    	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	    	System.out.println(" ");
		    System.out.println("1) Triangle \n2) Rectangle \n3) Circle \n4) Square \n5) Quit");
		    System.out.println("which shape: ");
		    shape = keyboard.nextInt();

		    if(shape == 1){
		      System.out.println("Base: ");
		      int base = keyboard.nextInt();
		      System.out.println("Height: ");
		      int height = keyboard.nextInt();
		      System.out.println("The area is " + area_triangle(base, height) + ".");
		    }
		    if(shape == 2){
		    	System.out.println("Length: ");
		    	int length = keyboard.nextInt();
		    	System.out.println("Width: ");
		    	int width = keyboard.nextInt();
		    	System.out.println("The area is " + area_rectangle(length, width) + ".");
		    }
		    if(shape == 3){
		    	System.out.println("Radius: ");
		    	double radius = keyboard.nextInt();
		    	System.out.println("The area is " + area_circle(radius) + ".");
		    }
		    if(shape == 4){
		    	System.out.println("side: ");
		    	int side = keyboard.nextInt();
		    	System.out.println("The area is " + area_square(side) + ".");
		    }
	    	if(shape == 5){
	    	System.out.println("Goodbye");
	    	}
	    }
    }
}
