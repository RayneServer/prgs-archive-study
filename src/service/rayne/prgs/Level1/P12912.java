package service.rayne.prgs.Level1;

public class P12912 {
  public long solution(int a, int b) {
    long result = 0;
    for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
      result += i;
    }

    return result;
  }
}
