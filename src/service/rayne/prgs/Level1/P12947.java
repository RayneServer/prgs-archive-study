package service.rayne.prgs.Level1;

import java.util.Arrays;

public class P12947 {
  public boolean solution(int x) {
    int num = Arrays.stream(String.valueOf(x).split(""))
      .mapToInt(Integer::parseInt)
      .sum()
      ;

    return x % num == 0;
  }
}
