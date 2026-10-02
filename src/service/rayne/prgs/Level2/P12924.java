package service.rayne.prgs.Level2;

public class P12924 {
  public int solution(int n) {
    int firstNum = 1;
    int lastNum = 1;
    int count = 0;
    int sum = 1;

    while (true) {
      if (sum == n) {
        count++;

        if (firstNum == lastNum) break;
        else {
          sum += ++firstNum;
          continue;
        }
      }

      if (sum < n) {
        sum += ++firstNum;
        continue;
      } else {
        sum -= lastNum++;
        continue;
      }
    }

    return count;
  }
}
