package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181899 {
  public int[] solution(int start_num, int end_num) {
    List<Integer> resultList = new ArrayList<>();

    for (int i = start_num; i >= end_num; i--) {
      resultList.add(i);
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
