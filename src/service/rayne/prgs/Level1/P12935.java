package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.List;

public class P12935 {
  public int[] solution(int[] arr) {
    if (arr.length == 1) return new int[]{-1};

    int minValue = Integer.MAX_VALUE;
    for (int num : arr) {
      if (num < minValue) minValue = num;
    }

    List<Integer> resultList = new ArrayList<>();
    for (int num : arr) {
      if (num == minValue) continue;
      resultList.add(num);
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
