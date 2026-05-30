package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P120835 {
  public int[] solution(int[] emergency) {
    List<Integer> emList = new ArrayList<>();
    List<Integer> sortList = new ArrayList<>();
    for (int i : emergency) {
      emList.add(i);
      sortList.add(i);
    }

    sortList.sort(Comparator.reverseOrder());
    int[] result = new int[emergency.length];
    int counter = 1;
    for (Integer i : sortList) {
      int index = emList.indexOf(i);
      result[index] = counter++;
    }

    return result;
  }
}
