package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181866 {
  public String[] solution(String myString) {
    String[] inputArr = myString.split("x");
    Arrays.sort(inputArr);

    return Arrays.stream(inputArr).filter((str) -> !str.isEmpty()).toArray(String[]::new);
  }
}
