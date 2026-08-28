package service.rayne.prgs.Level0;

public class P120846 {
  public int solution(int n) {
    int[] numArr = new int[n + 1];

    int count = 0;
    for (int i = 2; i < numArr.length; i++) {
      if (numArr[i] == 1) {
        count++;
        continue;
      } else {
        for (int j = i * 2; j < numArr.length; j += i) {
          numArr[j] = 1;
        }
      }
    }

    return count;
  }
}
