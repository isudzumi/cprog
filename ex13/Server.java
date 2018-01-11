import java.io.*;
import java.lang.*;
import java.net.*;

class Server {
  public static void main(String[] args) {
    // •W€“ü—Í
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Write something you want to send");
    try {
      String data = new String(in.readLine());
      ServerSocket server = new ServerSocket(1234);
      Socket socket = server.accept();
      System.out.println("Server has connected!");
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      System.out.println("Sending String : " + data);
      out.print(data);
      out.close();
      socket.close();
      server.close();
    } catch (Exception e) {
      System.out.println("Whoops! It didn't work!");
    }
  }
}
