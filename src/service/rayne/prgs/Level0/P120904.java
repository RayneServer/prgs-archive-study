package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120904 {
  public int solution(int num, int k) {
    int[] numArr = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();

    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] == k) return i + 1;
    }

    return -1;
  }
}
