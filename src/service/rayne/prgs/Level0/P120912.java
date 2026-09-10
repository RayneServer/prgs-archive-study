package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120912 {
  public int solution(int[] array) {
    StringBuilder sb = new StringBuilder();
    for (int num : array) sb.append(num);

    String[] resultArr = Arrays.stream(sb.toString().split("")).filter((s) -> s.equals("7")).toArray(String[]::new);

    return resultArr.length;
  }
}
