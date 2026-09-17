package service.rayne.prgs.Level1;

public class P12934 {
  public long solution(long n) {
    for (long i = 1; i * i <= n; i++) {
      if (i * i == n) return ((++i * i));
    }

    return -1;
  }
}
