class Test {
  int i = 10;
  int j = i * 2;
  int sum(int m) {
    return j + m;
  }
}

public class Sample30 {
  public static void main(String[] args) {
    Test t = new Test();
    System.out.println("t�I�u�W�F�N�g�̃t�B�[���hj�̒l:" + t.j);
    System.out.println("t�I�u�W�F�N�g�̃��\�b�hsum(2)�̌���:" + t.sum(2));
  }
}
