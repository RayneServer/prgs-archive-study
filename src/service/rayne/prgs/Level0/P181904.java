package service.rayne.prgs.Level0;

public class P181904 {
  public String solution(String my_string, int m, int c) {
    StringBuilder sb = new StringBuilder();
    String[] wordArr = my_string.split("");

    for (int i = c - 1; i < my_string.length(); i += m) {
      sb.append(wordArr[i]);
    }

    return sb.toString();
  }
}
