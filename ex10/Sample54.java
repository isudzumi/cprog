import java.io.*;

public class Sample54 {
  public static void main(String[] args) {
    try {
      int a = System.in.read();
      System.out.println("���͕���:" + (char)a);
    } catch (IOException e) {
      System.out.println("���̓G���[");
    }
  }
}
