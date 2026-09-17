package service.rayne.prgs.Level1;

import java.util.Arrays;

public class P12931 {
  public int solution(int n) {
    return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
  }
}
