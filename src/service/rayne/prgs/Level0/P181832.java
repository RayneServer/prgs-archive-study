package service.rayne.prgs.Level0;

public class P181832 {
  public int[][] solution(int n) {
    int[][] answer = new int[n][n];
    int number = 1;
    int pointX = 0;
    int pointY = 0;

    answer[pointX][pointY] = number++;
    for (int i = 0; i < n - 1; i++) {
      answer[pointX][++pointY] = number++;
    }

    boolean isDown = true;
    for (int i = n - 1; i > 0; i--) {
      if (isDown) {
        for (int j = 0; j < i; j++) answer[++pointX][pointY] = number++;
        for (int j = 0; j < i; j++) answer[pointX][--pointY] = number++;
        isDown = false;
      } else {
        for (int j = 0; j < i; j++) answer[--pointX][pointY] = number++;
        for (int j = 0; j < i; j++) answer[pointX][++pointY] = number++;
        isDown = true;
      }
    }

    return answer;
  }
}
