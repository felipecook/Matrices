package edu.cnm.deepdive;

import java.util.Arrays;

public class Matrices {

  public static void main(String[] args) {
    int[][] testMat = {{3,4}, {5,6}};
    Matrices matrices = new Matrices();
    matrices.rotate(testMat);
    System.out.println(Arrays.toString(testMat));
  }

  public static int[][] rotate(int[][] data) {

    int[][] returnData = new int[data.length][data.length];

    for (int c = 0; c < data.length; c++) {
      for (int r = 0; r < data.length; r++) {
        returnData[c][r] = data[c][data.length - 1 - r];
      }
    }

    return returnData;
  }

}
