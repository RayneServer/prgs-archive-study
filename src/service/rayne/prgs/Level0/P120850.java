package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120850 {
  public int[] solution(String my_string) {
    String[] strArr = my_string.replaceAll("[a-z]", "").split("");
    Arrays.sort(strArr);

    return Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
  }
}
