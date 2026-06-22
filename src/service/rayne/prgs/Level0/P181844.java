package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181844 {
  public int[] solution(int[] arr, int[] delete_list) {
    List<Integer> numList = new ArrayList<>();
    for (int num : arr) {
      numList.add(num);
    }

    for (int num : delete_list) {
      numList.remove(Integer.valueOf(num));
    }

    int[] result = new int[numList.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = numList.get(i);
    }

    return result;
  }
}
