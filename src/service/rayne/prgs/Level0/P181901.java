package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181901 {
  public int[] solution(int n, int k) {
    List<Integer> resultList = new ArrayList<>();
    int runner = k;

    while (runner <= n) {
      resultList.add(runner);
      runner += k;
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
