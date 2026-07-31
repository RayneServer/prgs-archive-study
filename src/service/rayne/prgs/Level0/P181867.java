package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181867 {
  public int[] solution(String myString) {
    String[] input = myString.split("x", -1);

    return Arrays.stream(input).mapToInt(String::length).toArray();
  }
}
