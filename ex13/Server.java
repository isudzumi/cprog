import java.io.*;
import java.lang.*;
import java.net.*;

class Server {
  public static void main(String[] args) {
    String data = "Toobie ornaught toobie";
    try {
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
