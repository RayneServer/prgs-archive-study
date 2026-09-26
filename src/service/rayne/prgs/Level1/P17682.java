package service.rayne.prgs.Level1;

public class P17682 {
  public int solution(String dartResult) {
    int[] resultArr = new int[3];
    int idx = 0;

    int num = 0;
    boolean isTen = false;
    for (int i = 0; i < dartResult.length(); i++) {
      char c = dartResult.charAt(i);

      if (c >= '0' && c <= '9') {
        if (isTen) {
          num *= 10;
          isTen = false;
          continue;
        }

        if (num != 0) {
          resultArr[idx++] = num;
          num = 0;
        }

        if (c == '1') isTen = true;

        num += c - '0';
        continue;
      }

      isTen = false;

      if (c == 'S') continue;

      if (c == 'D') {
        num = (num * num);
        continue;
      }
      if (c == 'T') {
        num = (num * num * num);
        continue;
      }

      if (c == '*') {
        if (idx != 0) resultArr[idx - 1] *= 2;
        num *= 2;
        continue;
      }

      if (c == '#') {
        num *= -1;
        continue;
      }
    }

    resultArr[idx] = num;

    int result = resultArr[0] + resultArr[1] + resultArr[2];
    return result;
  }
}
