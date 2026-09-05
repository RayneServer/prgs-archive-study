package service.rayne.prgs.Level0;

public class P120896 {
  public String solution(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      String str = String.valueOf((char) (i + 'a'));
      if (s.indexOf(str) != -1 && s.indexOf(str) == s.lastIndexOf(str)) sb.append(str);
    }

    return sb.toString();
  }
}
