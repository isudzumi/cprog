import java.io.*;

public class Sample57 {
  public static void main(String[] args) {
    try {
      BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
      o.write("文字列\n");
      o.flush();
    } catch (IOException e) {
      System.out.println("出力エラー");
    }
  }
}
