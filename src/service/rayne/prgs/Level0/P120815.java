package service.rayne.prgs.Level0;

public class P120815 {
  public int solution(int n) {
    int pizza = 6;

    int a = n;
    int b = pizza;
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }

    return n / a;
  }
}
