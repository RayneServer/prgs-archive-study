package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P120905 {
  public int[] solution(int n, int[] numlist) {
    List<Integer> resultList = new ArrayList<>();

    for (int i = 0; i < numlist.length; i++) {
      if (numlist[i] % n == 0) resultList.add(numlist[i]);
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
