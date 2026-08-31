package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120851 {
  public int solution(String my_string) {
    String[] strArr = my_string.replaceAll("[a-zA-Z]", "").split("");

    return Arrays.stream(strArr).mapToInt(Integer::parseInt).sum();
  }
}
