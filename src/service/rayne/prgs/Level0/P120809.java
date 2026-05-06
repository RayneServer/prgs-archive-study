package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120809 {
  public int[] solution(int[] numbers) {
    return Arrays.stream(numbers).map((num) -> num * 2).toArray();
  }
}
