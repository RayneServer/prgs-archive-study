package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120891 {
  public int solution(int order) {
    int[] orderArr = Arrays.stream(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();

    int count = 0;
    for (int num : orderArr) {
      if (num != 0 && num % 3 == 0) count++;
    }

    return count;
  }
}
