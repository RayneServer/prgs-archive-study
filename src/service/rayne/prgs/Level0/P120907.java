package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P120907 {
  public String[] solution(String[] quiz) {
    List<String> resultList = new ArrayList<>();

    for (String fn : quiz) {
      String[] fnArr = fn.split(" ");
      int numX = Integer.parseInt(fnArr[0]);
      int numY = Integer.parseInt(fnArr[2]);
      int numZ = Integer.parseInt(fnArr[4]);

      if ("+".equals(fnArr[1])) {
        String result = numX + numY == numZ ? "O" : "X";
        resultList.add(result);
      } else {
        String result = numX - numY == numZ ? "O" : "X";
        resultList.add(result);
      }
    }

    return resultList.stream().toArray(String[]::new);
  }
}
