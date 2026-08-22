package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181860 {
  public int[] solution(int[] arr, boolean[] flag) {
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (flag[i]) {
        for (int j = 0; j < arr[i] * 2; j++) resultList.add(arr[i]);
      } else {
        for (int j = 0; j < arr[i]; j++) resultList.remove(resultList.size() - 1);
      }
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
