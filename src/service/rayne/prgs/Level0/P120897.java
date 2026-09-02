package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P120897 {
  public int[] solution(int n) {
    List<Integer> resultList = new ArrayList<>();

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        resultList.add(i);
        if (n / i != i) resultList.add(n / i);
      }
    }

    return resultList.stream().sorted().mapToInt(Integer::intValue).toArray();
  }
}
