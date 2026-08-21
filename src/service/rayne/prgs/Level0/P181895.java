package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181895 {
  public int[] solution(int[] arr, int[][] intervals) {
    List<Integer> resultList = new ArrayList<>();
    for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
      resultList.add(arr[i]);
    }

    for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
      resultList.add(arr[i]);
    }

    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
