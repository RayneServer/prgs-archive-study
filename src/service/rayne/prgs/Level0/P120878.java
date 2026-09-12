package service.rayne.prgs.Level0;

public class P120878 {
  public int solution(int a, int b) {
    while (true) {
      if (b % 2 != 0) break;
      b /= 2;
    }

    while (true) {
      if (b % 5 != 0) break;
      b /= 5;
    }

    return a % b == 0 ? 1 : 2;
  }
}
