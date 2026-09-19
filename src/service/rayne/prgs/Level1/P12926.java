package service.rayne.prgs.Level1;

public class P12926 {
  public String solution(String s, int n) {
    char[] chArr = s.toCharArray();
    for (int i = 0; i < chArr.length; i++) {
      char c = chArr[i];
      if (c == ' ') continue;

      if (c <= 'Z') {
        chArr[i] = (char) ((((c - 'A') + n) % 26) + 'A');
      } else {
        chArr[i] = (char) ((((c - 'a') + n) % 26) + 'a');
      }
    }

    return new String(chArr);
  }
}
