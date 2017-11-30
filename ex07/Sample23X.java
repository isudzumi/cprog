public class Sample23X {
  public static void main(String[] args) {
    int [][] data = new int[][]{
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}
    };
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[0].length; j++) {
        System.out.print(data[i][j] + ", ");
      }
      System.out.println();
    }
  }
}
