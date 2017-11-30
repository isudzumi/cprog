public class IncrementSample {
  public static void main(String[] args) {
    int a = 0;
    int x;

    System.out.println("a = " + a++);
    System.out.println("a = " + a);

    x = ++a;
    System.out.println("a = " + a);
    System.out.println("x = " + x);
  }
}
