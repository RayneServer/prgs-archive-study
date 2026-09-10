package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P120860 {
  public int solution(int[][] dots) {
    Set<Integer> xSet = new HashSet<>();
    Set<Integer> ySet = new HashSet<>();

    for (int i = 0; i < dots.length; i++) {
      xSet.add(dots[i][0]);
      ySet.add(dots[i][1]);
    }

    List<Integer> xList = new ArrayList<>(xSet);
    List<Integer> yList = new ArrayList<>(ySet);

    return Math.abs(xList.getFirst() - xList.getLast()) * Math.abs(yList.getFirst() - yList.getLast());
  }
}
