package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P120876 {
  public int solution(int[][] lines) {
    List<Integer> pointList = new ArrayList<>();
    for (int[] line : lines) {
      pointList.add(line[0]);
      pointList.add(line[1]);
    }

    pointList.sort(Comparator.naturalOrder());
    int result = 0;
    for (int i = 0; i < pointList.size() - 1; i++) {
      int leftPoint = pointList.get(i);
      int rightPoint = pointList.get(i + 1);

      int lineCount = 0;
      for (int[] line : lines) {
        if (leftPoint >= line[0] && rightPoint <= line[1]) lineCount++;
      }

      if (lineCount > 1) result += (rightPoint - leftPoint);
    }

    return result;
  }
}
