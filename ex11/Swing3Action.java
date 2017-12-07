import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing3Action implements ActionListener {

  JLabel labelnorth, labelsouth;
  JLabel icon, icon2, icon3;
  JButton button;

  public Swing3Action() {
    JFrame frame = new JFrame("タイトル");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    Container contentPane = frame.getContentPane();

    //JPanelオブジェクトを生成
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.setBackground(Color.CYAN);
    contentPane.add(panel);

    //ラベルの追加
    labelnorth = new JLabel("上部ラベルの文字");
    labelsouth = new JLabel("下部ラベルの文字");
    //アイコン
    Icon img = new ImageIcon("img/apple.png");
    Icon img2 = new ImageIcon("img/dango.png");
    Icon img3 = new ImageIcon("img/donuts.png");
    icon = new JLabel(img);
    icon2 = new JLabel(img2);
    icon3 = new JLabel(img3);

    //ボタンの追加
    button = new JButton();
    button.setText("リンゴを煎餅に");
    button.addActionListener(this);

    panel.add(labelnorth, BorderLayout.NORTH);
    panel.add(icon, BorderLayout.CENTER);
    panel.add(icon2, BorderLayout.WEST);
    panel.add(icon3, BorderLayout.EAST);
    panel.add(labelsouth, BorderLayout.SOUTH);
    panel.add(button, BorderLayout.SOUTH);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    Icon img4 = new ImageIcon("img/sembei.png");
    icon.setIcon(img4);
  }

  public static void main(String[] args) {
    Swing3Action s3 = new Swing3Action();
  }
}
