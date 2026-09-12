package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120880 {
  public int[] solution(int[] numlist, int n) {
    Integer[] numArr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

    Arrays.sort(numArr, (o1, o2) -> {
      if (Math.abs(o1 - n) == Math.abs((n - o2))) return Integer.compare(o2, o1);
      else return Integer.compare(Math.abs(o1 - n), Math.abs((n - o2)));
    });

    return Arrays.stream(numArr).mapToInt(Integer::intValue).toArray();
  }
}
