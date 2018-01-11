import java.io.*;
import java.lang.*;
import java.net.*;

class Client {
  public static void main(String[] args) {
    try{
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      String data = new String(in.readLine());
      Socket mysocket = new Socket("localhost", 1234);
      BufferedReader in = new BufferedReader(new InputStreamReader(mysocket.getInputStream()));
      System.out.println("Recieved String : ");
      while(!in.ready()){}
      System.out.println(in.readLine());
      System.out.print("\n");
      in.close();
    } catch (Exception e) {
      System.out.println("Whoops! It didn't work!");
    }
  }
}
