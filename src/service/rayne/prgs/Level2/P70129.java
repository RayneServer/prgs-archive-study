package service.rayne.prgs.Level2;

public class P70129 {
  public int[] solution(String s) {
    int calCount = 0;
    int zeroCount = 0;

    while (!s.equals("1")) {
      String[] strArr = s.split("");

      // 0 제거
      StringBuilder sb = new StringBuilder();
      for (String str : strArr) {
        if (str.equals("1")) sb.append(str);
        else zeroCount++;
      }

      // 길이를 이진수로 변환
      int strLength = sb.length();
      sb = new StringBuilder();
      while (strLength > 0) {
        sb.append(strLength % 2);
        strLength /= 2;
      }

      s = sb.toString();
      calCount++;
    }

    return new int[]{calCount, zeroCount};
  }
}
