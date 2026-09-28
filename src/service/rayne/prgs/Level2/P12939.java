package service.rayne.prgs.Level2;

public class P12939 {
  public String solution(String s) {
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;

    for (String str : s.split(" ")) {
      int value = Integer.parseInt(str);

      if (value > maxValue) maxValue = value;
      if (value < minValue) minValue = value;
    }

    return minValue + " " + maxValue;
  }
}
