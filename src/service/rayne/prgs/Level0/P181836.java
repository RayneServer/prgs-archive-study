package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181836 {
  public String[] solution(String[] picture, int k) {
    List<String> resultList = new ArrayList<>();
    for (String str : picture) {
      String[] strArr = str.split("");

      for (int i = 0; i < strArr.length; i++) {
        strArr[i] = strArr[i].repeat(k);
      }

      String afterStr = String.join("", strArr);
      for (int i = 0; i < k; i++) {
        resultList.add(afterStr);
      }
    }

    return resultList.toArray(String[]::new);
  }
}
