import java.io.*;

public class Sample57 {
  public static void main(String[] args) {
    try {
      BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
      o.write("•¶š—ñ\n");
      o.flush();
    } catch (IOException e) {
      System.out.println("o—ÍƒGƒ‰[");
    }
  }
}
