package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181914 {
  public int solution(String number) {
    return Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum() % 9;
  }
}
