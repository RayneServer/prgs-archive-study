package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181886 {
  public String[] solution(String[] names) {
    List<String> resultList = new ArrayList<>();
    for (int i = 0; i < names.length; i++) {
      if (i % 5 == 0) resultList.add(names[i]);
    }

    return resultList.toArray(String[]::new);
  }
}
