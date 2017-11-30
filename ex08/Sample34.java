class Test {
  int sum(int[] data) {
    int r = 0;
    for (int i = 0; i < data.length; i++) {
      r += data[i];
    }
    return r;
  }
}

public class Sample34 {
  public static void main(String[] args) {
    Test test = new Test();
    int[] datal = new int[]{1, 2, 3, 4, 5};
    int result;
    result = test.sum(datal);
    System.out.println(result);
  }
}
