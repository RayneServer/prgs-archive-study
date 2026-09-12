package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P120866 {
  public int solution(int[][] board) {
    List<Integer> listX = new ArrayList<>();
    List<Integer> listY = new ArrayList<>();

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 1) {
          listX.add(i);
          listY.add(j);
        }
      }
    }

    for (int i = 0; i < listX.size(); i++) {
      mark(board, listX.get(i), listY.get(i));
    }

    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 0) count++;
      }
    }

    return count;
  }

  private void mark(int[][] board, int x, int y) {
    int[] pointX = {1, 0, -1};
    int[] pointY = {1, 0, -1};

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        try {
          board[x + pointX[i]][y + pointY[j]] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
          continue;
        }
      }
    }
  }
}
