package service.rayne.prgs.Level0;

public class P181939 {
  public int solution(int a, int b) {
    int ab = Integer.parseInt("" + a + b);
    int ba = Integer.parseInt("" + b + a);

    return Integer.max(ab, ba);
  }
}
