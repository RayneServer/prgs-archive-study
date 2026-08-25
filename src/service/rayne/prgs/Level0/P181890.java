package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181890 {
  public String[] solution(String[] str_list) {
    String word = "";
    int idx = 0;

    for (int i = 0; i < str_list.length; i++) {
      String str = str_list[i];
      if (!str.equals("l") && !str.equals("r")) continue;
      else {
        word = str;
        idx = i;
        break;
      }
    }

    List<String> resultList = new ArrayList<>();
    if (word.equals("l")) {
      for (int i = 0; i < idx; i++) {
        resultList.add(str_list[i]);
      }
    } else {
      for (int i = idx + 1; i < str_list.length; i++) {
        resultList.add(str_list[i]);
      }
    }

    return resultList.toArray(String[]::new);
  }
}
