package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181912 {
  public int[] solution(String[] intStrs, int k, int s, int l) {
    List<Integer> resultList = new ArrayList<>();

    for (String str : intStrs) {
      int num = Integer.parseInt(str.substring(s, s + l));
      if (num > k) resultList.add(num);
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
