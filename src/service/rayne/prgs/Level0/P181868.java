package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181868 {
  public String[] solution(String my_string) {
    return Arrays.stream(my_string.split(" ")).filter((str) -> !str.isBlank()).toArray(String[]::new);
  }
}
