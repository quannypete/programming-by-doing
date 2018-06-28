import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas{

  public void paint(Graphics g){
    g.setColor(Color.black);
    g.drawOval(100, 100, 200, 200);
    g.drawString("12", 196, 120);
    g.drawString("6", 198, 290);
    g.drawString("3", 280, 205);
    g.drawString("9", 110, 205);
    g.drawLine(105, 200, 200, 200);
    g.drawLine(125, 215, 205, 200);
    g.setColor(Color.gray);
    g.fillOval(190, 190, 20, 20);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("A Clock");
    jFrame.setSize(400,400);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ClockFace canvas = new ClockFace();
    jFrame.add(canvas);
    jFrame.setVisible(true);
  }
}
