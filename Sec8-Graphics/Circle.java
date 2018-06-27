import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas{

  public void paint(Graphics g){
    g.setColor(Color.green);
    g.fillOval(100, 100, 50, 50);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("A circle");
    jFrame.setSize(400,400);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Circle canvas = new Circle();
    jFrame.add(canvas);
    jFrame.setVisible(true);
  }
}
