class Test {
  void printString(String str) {
    System.out.println("Test�N���X:" + str);
  }
}

class ExTest extends Test {
  void printString(String str) {
    System.out.println("ExTest�N���X:" + str);
  }
  void printStr(String str) {
    super.printString(str);
  }
}

public class Sample43 {
  public static void main(String[] args) {
    ExTest ex_test = new ExTest();
    ex_test.printString("������");
  }
}
