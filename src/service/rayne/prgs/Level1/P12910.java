package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P12910 {
  public int[] solution(int[] arr, int divisor) {
    List<Integer> resultList = new ArrayList<>();
    for (int num : arr) {
      if (num % divisor == 0) resultList.add(num);
    }

    if (resultList.size() == 0) resultList.add(-1);
    return resultList.stream().sorted(Comparator.naturalOrder()).mapToInt(Integer::intValue).toArray();
  }
}
