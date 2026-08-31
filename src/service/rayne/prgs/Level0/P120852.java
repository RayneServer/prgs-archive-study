package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P120852 {
  public int[] solution(int n) {
    List<Integer> numList = new ArrayList<>();
    int runner = 2;

    while (runner <= n) {
      if (n % runner == 0) {
        n /= runner;
        if (!numList.contains(runner)) numList.add(runner);
        continue;
      }

      runner++;
    }

    return numList.stream().mapToInt(Integer::intValue).toArray();
  }
}
