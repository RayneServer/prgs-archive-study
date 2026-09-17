package service.rayne.prgs.Level1;

import java.util.Arrays;

public class P12932 {
  public int[] solution(long n) {
    return Arrays.stream(new StringBuilder(String.valueOf(n)).reverse().toString().split(""))
                 .mapToInt(Integer::parseInt)
                 .toArray()
                 ;
  }
}
