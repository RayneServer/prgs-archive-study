package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181891 {
  public int[] solution(int[] num_list, int n) {
    List<Integer> resultList = new ArrayList<>();

    for (int i = 0; i < num_list.length; i++) {
      int idx = (i + n) % num_list.length;
      resultList.add(num_list[idx]);
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
