package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120886 {
  public int solution(String before, String after) {
    String[] beforeArr = before.split("");
    String[] afterArr = after.split("");

    Arrays.sort(beforeArr);
    Arrays.sort(afterArr);

    before = String.join("", beforeArr);
    after = String.join("", afterArr);

    return before.equals(after) ? 1 : 0;
  }
}
