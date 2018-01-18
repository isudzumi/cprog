import java.io.*;

public class Sample59 {
  public static void main(String[] args) {
    try {
      String str;
      FileReader in = new FileReader("sample.txt");
      BufferedReader b = new BufferedReader(in);
      while ((str = b.readLine()) != null) {
        System.out.println(str);
      }
      b.close();
    } catch (IOException e) {
      System.out.println("ファイル出力エラー");
    }
  }
}
