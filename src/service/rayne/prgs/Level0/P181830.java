package service.rayne.prgs.Level0;

public class P181830 {
  public int[][] solution(int[][] arr) {
    int row = arr.length;
    int col = arr[0].length;
    int length = Math.max(row, col);

    int[][] result = new int[length][length];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        result[i][j] = arr[i][j];
      }
    }

    return result;
  }
}
