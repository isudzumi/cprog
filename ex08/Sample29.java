class Drink {
  String name;
  int capacity;
  int divide(int p) {
    return capacity / p;
  }
}

public class Sample29 {
  public static void main(String[] args) {
    Drink wine = new Drink();

    int i;
    int p = 100;
    wine.name = "���C��";
    wine.capacity = 750;
    i = wine.divide(p);
    System.out.println("���O:" + wine.name);
    System.out.println(p + "ml��" + i + "�t����");
  }
}
