class Test {
  int[] sum(int[] data) {
    int[] r = new int[data.length];
    for (int i = 0; i < data.length; i++) {
      r[i] = data[i] * data[i];
    }
    return r;
  }
}

public class Sample34X {
  public static void main(String[] args) {
    Test test = new Test();
    int[] datal = new int[]{1, 2, 3, 4, 5};
    int result[] = test.sum(datal);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
