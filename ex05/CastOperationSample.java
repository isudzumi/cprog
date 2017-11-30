public class CastOperationSample {
  public static void main(String[] args) {
    double d1 = 1.28;
    double d2 = 51.2;
    double x;

    x = d1 * d2;
    System.out.println(x);

    x = (int)d1 * d2;
    System.out.println(x);

    x = (int)(d1 * d2);
    System.out.println(x);
  }
}
