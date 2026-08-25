package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181893 {
  public int[] solution(int[] arr, int[] query) {
    List<Integer> numList = new ArrayList<>();
    for (int num : arr) numList.add(num);

    for (int i = 0; i < query.length; i++) {
      if (i % 2 != 0) cutLeft(numList, query[i]);
      else cutRight(numList, query[i]);
    }

    return numList.stream().mapToInt(Integer::intValue).toArray();
  }

  private void cutLeft(List<Integer> numList, int idx) {
    for (int i = 0; i < idx; i++) numList.removeFirst();
  }

  private void cutRight(List<Integer> numList, int idx) {
    int repeat = numList.size() - idx - 1;
    for (int i = 0; i < repeat; i++) numList.removeLast();
  }
}
