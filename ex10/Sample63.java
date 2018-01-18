import java.io.*;

public class Sample63 {
  public static void main(String[] args) {
    try {
      int i;
      FileInputStream in = new FileInputStream("usamaru.JPG");
      FileOutputStream out = new FileOutputStream("usamaru_.JPG");

      while ((i = in.read()) != -1) {
        out.write(i);
      }
      in.close();
      out.close();
    } catch(IOException e) {
      System.out.println("“üo—ÍƒGƒ‰[");
    }
  }
}
