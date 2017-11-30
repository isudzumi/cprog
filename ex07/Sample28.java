public class Sample28 {
  public static void main(String[] args) {
    LOOP1:
    for (int i = 0; i < 10; i++) {
      System.out.print(i + ":");
      int j = 0;
      while(j < 10) {
        System.out.print(" " + j);
        if (i * j > 20) {
          break LOOP1;
        }
        j++;
      }
      System.out.print("\n");
    }
  }
}
