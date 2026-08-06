package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181919 {
  public int[] solution(int n) {
    List<Integer> numList = new ArrayList<>();
    numList.add(n);

    while (n != 1) {
      if (n % 2 == 0) n /= 2;
      else n = (3 * n) + 1;

      numList.add(n);
    }

    return numList.stream().mapToInt(Integer::intValue).toArray();
  }
}
