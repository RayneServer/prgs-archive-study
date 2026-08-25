package service.rayne.prgs.Level1;

public class P340212 {
  public int solution(int[] diffs, int[] times, long limit) {
    int levelLeft = 1;
    int levelRight = 100000;
    int level = (levelLeft + levelRight) / 2;
    int result = 0;

    while (levelLeft <= levelRight) {
      long clearTime = 0;
      level = (levelLeft + levelRight) / 2;

      for (int i = 0; i < diffs.length; i++) {
        if (diffs[i] <= level) {
          clearTime += times[i];
        } else {
          int repeatCount = diffs[i] - level;
          clearTime += (times[i]) + ((times[i - 1] + times[i]) * repeatCount);
        }
      }

      if (clearTime <= limit) {
        levelRight = level - 1;
        result = level;
      }
      else levelLeft = level + 1;
    }

    return result;
  }
}
