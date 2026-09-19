package service.rayne.prgs.Level1;

public class P86491 {
  public int solution(int[][] sizes) {
    for (int[] size : sizes) {
      if (size[1] > size[0]) {
        int temp = size[0];
        size[0] = size[1];
        size[1] = temp;
      }
    }

    int maxRow = 0;
    int maxCol = 0;

    for (int[] size : sizes) {
      if (size[0] > maxRow) maxRow = size[0];
      if (size[1] > maxCol) maxCol = size[1];
    }

    return maxRow * maxCol;
  }
}
