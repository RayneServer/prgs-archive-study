package service.rayne.prgs.Level0;

public class P120882 {
  public int[] solution(int[][] score) {
    double[] scoreArr = new double[score.length];
    for (int i = 0; i < scoreArr.length; i++) {
      scoreArr[i] = (score[i][0] + score[i][1]) / 2.0;
    }

    int[] rankArr = new int[scoreArr.length];
    for (int i = 0; i < rankArr.length; i++) {
      double point = scoreArr[i];
      int count = 0;

      for (int j = 0; j < scoreArr.length; j++) {
        if (scoreArr[j] > point) count++;
      }

      rankArr[i] = count + 1;
    }

    return rankArr;
  }
}
