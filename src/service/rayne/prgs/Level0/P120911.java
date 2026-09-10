package service.rayne.prgs.Level0;

import java.util.Arrays;
import java.util.Comparator;

public class P120911 {
  public String solution(String my_string) {
    String[] resultArr = Arrays.stream(my_string.toLowerCase().split("")).sorted(Comparator.naturalOrder()).toArray(String[]::new);

    return String.join("", resultArr);
  }
}
