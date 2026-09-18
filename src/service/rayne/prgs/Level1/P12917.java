package service.rayne.prgs.Level1;

import java.util.Arrays;
import java.util.Comparator;

public class P12917 {
  public String solution(String s) {
    String[] strArr = Arrays.stream(s.split(""))
                            .sorted(Comparator.reverseOrder())
                            .toArray(String[]::new)
                            ;

    return String.join("", strArr);
  }
}
