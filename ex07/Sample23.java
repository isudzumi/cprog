public class Sample23 {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("skip")) {
        continue;
      }
      System.out.println("��" + (i + 1) + "����:" + args[i]);
      if (args[i].equals("end")) {
        break;
      }
    }
  }
}
