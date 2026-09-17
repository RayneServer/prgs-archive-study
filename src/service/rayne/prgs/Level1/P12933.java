package service.rayne.prgs.Level1;

import java.util.Arrays;
import java.util.Comparator;

public class P12933 {
  public long solution(long n) {
    String[] result = Arrays.stream(String.valueOf(n).split(""))
                            .sorted(Comparator.reverseOrder())
                            .toArray(String[]::new)
                            ;

    return Long.parseLong(String.join("", result));
  }
}
