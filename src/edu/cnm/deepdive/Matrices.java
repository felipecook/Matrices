package edu.cnm.deepdive;

public class Matrices {

  public static void main(String[] args) {
    Matrices matrices = new Matrices();
    System.out.println(matrices.rotate());
  }

  public static int[][] rotate(int[][] data) {

    int[][] returnData = new int[data.length][data.length];

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length; j++) {
        int[][] tempData = new int[i][j];
        returnData[1][0] = data[0][0];
        returnData[0][0] = data[0][1];
        returnData[1][1] = data[1][0];
        returnData[0][1] = data[1][1];


      }
    }

  }

}
