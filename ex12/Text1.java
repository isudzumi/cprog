import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text1 implements ActionListener {

  JTextField t;
  JLabel lab;

  public Text1() {
    JFrame frame = new JFrame("タイトル");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    Container contentPane = frame.getContentPane();

    //JPanelオブジェクトを生成
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    panel.setBackground(Color.CYAN);
    contentPane.add(panel);

    t = new JTextField("10", 15);
    t.addActionListener(this);
    panel.add(t);

    lab = new JLabel(" * 2 = ");
    panel.add(lab);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    int x = Integer.parseInt(t.getText());
    lab.setText(" * 2 = " + (x * 2));
  }

  public static void main(String[] args) {
    Text1 s1 = new Text1();
  }
}
