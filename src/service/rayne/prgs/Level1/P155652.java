package service.rayne.prgs.Level1;

public class P155652 {
  public String solution(String s, String skip, int index) {
    String[] strArr = s.split("");
    for (int i = 0; i < strArr.length; i++) {
      // 최종적으로 밀어야 하는 양 계산
      int count = 0;
      int length = 0;
      char c = strArr[i].charAt(0);
      while (count < index) {
        c = (char) ((((c - 'a') + 1) % 26) + 'a');
        length++;

        if (skip.contains(String.valueOf(c))) continue;

        count++;
      }

      // 실제로 민 값으로 변경
      strArr[i] = String.valueOf(c);
    }

    return String.join("", strArr);
  }
}
