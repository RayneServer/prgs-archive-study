package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181918 {
  public int[] solution(int[] arr) {
    List<Integer> stkList = new ArrayList<>();

    for (int i = 0; i < arr.length;) {
      if (stkList.isEmpty()) {
        stkList.add(arr[i]);
        i++;
      } else if (stkList.getLast() < arr[i]) {
        stkList.add(arr[i]);
        i++;
      } else stkList.removeLast();
    }

    return stkList.stream().mapToInt(Integer::intValue).toArray();
  }
}
