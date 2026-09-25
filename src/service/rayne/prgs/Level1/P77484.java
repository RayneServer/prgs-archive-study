package service.rayne.prgs.Level1;

public class P77484 {
  public int[] solution(int[] lottos, int[] win_nums) {
    int[] result = new int[2];

    int zeroCount = 0;
    int correctCount = 0;
    for (int lotto : lottos) {
      if (lotto == 0) zeroCount++;
      else {
        for (int num : win_nums) {
          if (lotto == num) correctCount++;
        }
      }
    }

    result[0] = 7 - correctCount - zeroCount;
    if (result[0] == 7) result[0] = 6;

    result[1] = 7 - correctCount;
    if (result[1] == 7) result[1] = 6;

    return result;
  }
}
