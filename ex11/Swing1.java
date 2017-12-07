import javax.swing.*;
import java.awt.*;

public class Swing1 {
  public Swing1() {
    JFrame frame = new JFrame("ƒ^ƒCƒgƒ‹");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    Container contentPane = frame.getContentPane();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Swing1 s1 = new Swing1();
  }
}
