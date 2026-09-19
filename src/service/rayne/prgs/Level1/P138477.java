package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P138477 {
  public int[] solution(int k, int[] score) {
    List<Integer> myList = new ArrayList<>();
    int[] resultArr = new int[score.length];

    for (int i = 0; i < resultArr.length; i++) {
      myList.add(score[i]);
      myList.sort(Comparator.reverseOrder());

      if (myList.size() > k) myList.removeLast();
      resultArr[i] = myList.getLast();
    }

    return resultArr;
  }
}
