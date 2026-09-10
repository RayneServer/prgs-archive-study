package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P120913 {
  public String[] solution(String my_str, int n) {
    List<String> resultList = new ArrayList<>();
    int i = 0;
    for (; i < my_str.length(); i += n) {
      try {
        resultList.add(my_str.substring(i, i + n));
      } catch (StringIndexOutOfBoundsException e) {
        break;
      }
    }

    if (i != my_str.length()) resultList.add(my_str.substring(i));
    return resultList.toArray(String[]::new);
  }
}
