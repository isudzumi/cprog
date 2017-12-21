import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTCPChat {

  JLabel hostIP, port;
  JTextField txtIP, txtPort;

  public SimpleTCPChat() {
    JFrame frame = new JFrame("Simple TCP Chat");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(640, 480);
    Container contentPane = frame.getContentPane();

    //JPanelオブジェクトを生成
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.setBackground(Color.WHITE);
    contentPane.add(panel);

    //
    // 左側のパネル
    //
    JPanel panelLeft = new JPanel();
    panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.PAGE_AXIS));

    JPanel panelIP = new JPanel();
    panelIP.setLayout(new FlowLayout());

    hostIP = new JLabel("Host IP");
    txtIP = new JTextField("localhost", 15);
    panelIP.add(hostIP);
    panelIP.add(txtIP);
    panelLeft.add(panelIP);

    JPanel panelPort = new JPanel();
    panelPort.setLayout(new FlowLayout());

    port = new JLabel("Port");
    txtPort = new JTextField("1234", 15);
    panelPort.add(port);
    panelPort.add(txtPort);

    panelLeft.add(panelPort);

    JPanel panelBtn = new JPanel();
    panelBtn.setLayout(new FlowLayout());

    JRadioButton btnHost = new JRadioButton("Host", true);
    JRadioButton btnGuest = new JRadioButton("Guest", false);
    panelBtn.add(btnHost);
    panelBtn.add(btnGuest);

    panelLeft.add(panelBtn);


    //
    // 右側のパネル
    //
    JPanel panelRight = new JPanel();
    panelRight.setLayout(new BorderLayout());
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    panelRight.add(scrollPane);

    // JSplitPane
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    splitPane.add(panelLeft, JSplitPane.LEFT);
    splitPane.add(panelRight, JSplitPane.RIGHT);

    contentPane.add(splitPane);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SimpleTCPChat s1 = new SimpleTCPChat();
  }
}
