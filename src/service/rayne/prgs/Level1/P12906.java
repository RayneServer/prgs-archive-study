package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.List;

public class P12906 {
  public int[] solution(int []arr) {
    List<Integer> myList = new ArrayList<>();
    int lastNum = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == lastNum) continue;

      myList.add(arr[i]);
      lastNum = arr[i];
    }

    return myList.stream().mapToInt(Integer::intValue).toArray();
  }
}
