package service.rayne.prgs.Level0;

public class P120861 {
  public int[] solution(String[] keyinput, int[] board) {
    int rowLimit = board[0] / 2;
    int colLimit = board[1] / 2;
    int[] result = {0, 0};

    for (String move : keyinput) {
      switch (move) {
        case "up" -> {
          if (result[1] != colLimit) result[1]++;
        }

        case "down" -> {
          if (result[1] != -colLimit) result[1]--;
        }

        case "left" -> {
          if (result[0] != -rowLimit) result[0]--;
        }

        case "right" -> {
          if (result[0] != rowLimit) result[0]++;
        }
      }
    }

    return result;
  }
}
