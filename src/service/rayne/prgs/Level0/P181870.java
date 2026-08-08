package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181870 {
  public String[] solution(String[] strArr) {
    return Arrays.stream(strArr).filter((str) -> !str.contains("ad")).toArray(String[]::new);
  }
}
