import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.lang.*;

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

    // HOST IPの設定
    JPanel panelIP = new JPanel();
    panelIP.setLayout(new FlowLayout());

    hostIP = new JLabel("Host IP");
    txtIP = new JTextField("localhost", 15);
    panelIP.add(hostIP);
    panelIP.add(txtIP);
    panelLeft.add(panelIP);

    // Portの設定
    JPanel panelPort = new JPanel();
    panelPort.setLayout(new FlowLayout());

    port = new JLabel("Port");
    txtPort = new JTextField("1234", 15);
    panelPort.add(port);
    panelPort.add(txtPort);

    panelLeft.add(panelPort);

    // ラジオボタン
    JPanel panelRadioBtn = new JPanel();
    panelRadioBtn.setLayout(new FlowLayout());

    JRadioButton btnHost = new JRadioButton("Host", true);
    JRadioButton btnGuest = new JRadioButton("Guest", false);
    panelRadioBtn.add(btnHost);
    panelRadioBtn.add(btnGuest);

    panelLeft.add(panelRadioBtn);

    // ボタン
    JPanel panelBtn = new JPanel();
    panelBtn.setLayout(new GridLayout());

    JButton btnConnect = new JButton("Connect");
    JButton btnDisConnect = new JButton("Disconnect");
    panelBtn.add(btnConnect);
    panelBtn.add(btnDisConnect);

    panelLeft.add(panelBtn);


    //
    // 右側のパネル
    //

    //textArea
    JPanel panelRight = new JPanel();
    panelRight.setLayout(new BorderLayout());
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    panelRight.add(scrollPane);

    //Text Field
    JTextField textField = new JTextField();
    panelRight.add(textField, BorderLayout.SOUTH);

    //
    // JSplitPane
    //
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    splitPane.add(panelLeft, JSplitPane.LEFT);
    splitPane.add(panelRight, JSplitPane.RIGHT);

    contentPane.add(splitPane);


    // Status
    JLabel lblStatus = new JLabel("Offline");
    contentPane.add(lblStatus, BorderLayout.SOUTH);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SimpleTCPChat s1 = new SimpleTCPChat();
  }
}
