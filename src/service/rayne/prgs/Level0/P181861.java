package service.rayne.prgs.Level0;

import java.util.ArrayList;

public class P181861 {
  public int[] solution(int[] arr) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i : arr) {
      for (int j = 0; j < i; j++) arrayList.add(i);
    }

    return arrayList.stream().mapToInt(Integer::intValue).toArray();
  }
}
