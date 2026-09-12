package service.rayne.prgs.Level0;

public class P120921 {
  public int solution(String A, String B) {
    if (A.equals(B)) return 0;

    for (int i = 1; i <= A.length(); i++) {
      A = move(A);
      if (A.equals(B)) return i;
    }

    return -1;
  }

  private String move(String str) {
    return str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
  }
}
