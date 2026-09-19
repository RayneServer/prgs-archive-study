package service.rayne.prgs.Level1;

import java.util.ArrayList;
import java.util.List;

public class P42840 {
  public int[] solution(int[] answers) {
    int[] map1 = {1, 2, 3, 4, 5};
    int[] map2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] map3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[][] mapArr = {map1, map2, map3};

    int[] pointArr = new int[3];
    int maxPoint = -1;
    for (int i = 0; i < pointArr.length; i++) {
      int point = 0;

      for (int j = 0; j < answers.length; j++) {
        if (answers[j] == mapArr[i][j % (mapArr[i].length)]) point++;
      }

      pointArr[i] = point;
      if (point > maxPoint) maxPoint = point;
    }

    List<Integer> myList = new ArrayList<>();
    for (int i = 0; i < pointArr.length; i++) {
      if (pointArr[i] == maxPoint) myList.add(i + 1);
    }

    return myList.stream().mapToInt(Integer::intValue).toArray();
  }
}
