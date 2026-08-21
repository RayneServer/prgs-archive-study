package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P181909 {
  public String[] solution(String my_string) {
    List<String> resultList = new ArrayList<>();
    for (int i = 0; i < my_string.length(); i++) {
      resultList.add(my_string.substring(i));
    }

    resultList.sort(Comparator.naturalOrder());
    return resultList.toArray(String[]::new);
  }
}
