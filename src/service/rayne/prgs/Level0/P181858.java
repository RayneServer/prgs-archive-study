package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181858 {
  public int[] solution(int[] arr, int k) {
    List<Integer> resultList = new ArrayList<>();
    for (int num : arr) {
      if (!resultList.contains(num)) resultList.add(num);
      if (resultList.size() == k) break;
    }

    while (resultList.size() < k) resultList.add(-1);
    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
