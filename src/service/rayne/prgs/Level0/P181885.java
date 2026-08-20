package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181885 {
  public String[] solution(String[] todo_list, boolean[] finished) {
    List<String> resultList = new ArrayList<>();

    for (int i = 0; i < todo_list.length; i++) {
      if (!finished[i]) resultList.add(todo_list[i]);
    }

    return resultList.stream().toArray(String[]::new);
  }
}
