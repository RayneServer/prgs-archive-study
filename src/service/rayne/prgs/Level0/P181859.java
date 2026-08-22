package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181859 {
  public int[] solution(int[] arr) {
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (resultList.isEmpty()) resultList.add(arr[i]);
      else if (resultList.getLast() == arr[i]) resultList.removeLast();
      else resultList.add(arr[i]);
    }
    if (resultList.isEmpty()) return new int[]{-1};
    return resultList.stream().mapToInt(Integer::intValue).toArray();
  }
}
