package service.rayne.prgs.Level1;

public class P68935 {
  public int solution(int n) {
    StringBuilder sb = new StringBuilder();
    while (n > 0) {
      sb.append(n % 3);
      n /= 3;
    }

    return Integer.valueOf(sb.toString(), 3);
  }
}
