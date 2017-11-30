class Test {
  int i = 10;
  void sum() {
    System.out.println("Testクラスのフィールドiの値:" + i);
  }
}

class Sample32 {
  public static void main(String[] args) {
    Test test = new Test();
    test.sum();
  }
}
