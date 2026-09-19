package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.List;

public class P12982 {
  public int solution(int[] d, int budget) {
    List<Integer> myList = new ArrayList<>();
    for (int i = 0; i < d.length; i++) myList.add(d[i]);

    myList.sort(null);

    int count = 0;
    int sum = 0;
    for (int i = 0; i < myList.size(); i++) {
      if (sum + myList.get(i) > budget) break;

      sum += myList.get(i);
      count++;
    }

    return count;
  }
}
