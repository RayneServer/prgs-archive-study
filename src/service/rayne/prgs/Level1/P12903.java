package service.rayne.prgs.Level1;

public class P12903 {
  public String solution(String s) {
    int length = s.length() / 2;

    return s.length() % 2 == 0 ? s.substring(length - 1, length + 1) : s.substring(length, length + 1);
  }
}
