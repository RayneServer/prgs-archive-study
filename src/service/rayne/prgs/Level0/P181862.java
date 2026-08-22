package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181862 {
  public String[] solution(String myStr) {
    myStr = myStr.replaceAll("a", "1").replaceAll("b", "1").replaceAll("c", "1");

    String[] result = Arrays.stream(myStr.split("1+")).filter((str) -> !str.isEmpty()).toArray(String[]::new);

    return result.length > 0 ? result : new String[]{"EMPTY"};
  }
}
