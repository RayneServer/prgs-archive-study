package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P135808 {
  public int solution(int k, int m, int[] score) {
    if (score.length < m) return 0;

    List<Integer> myList = new ArrayList<>();
    for (int num : score) myList.add(num);

    myList.sort(Comparator.reverseOrder());

    int result = 0;
    for (int i = m - 1; i < myList.size(); i += m) {
      result += myList.get(i) * m;
    }

    return result;
  }
}
