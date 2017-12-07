import javax.swing.*;
import java.awt.*;

public class Swing2 {
  public Swing2() {
    JFrame frame = new JFrame("タイトル");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    Container contentPane = frame.getContentPane();

    //JPanelオブジェクトを生成
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.setBackground(Color.CYAN);
    contentPane.add(panel);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Swing2 s2 = new Swing2();
  }
}
