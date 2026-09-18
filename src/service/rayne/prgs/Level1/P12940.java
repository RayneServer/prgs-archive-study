package service.rayne.prgs.Level1;

public class P12940 {
  public int[] solution(int n, int m) {
    return new int[]{gcd(n, m), (n * m) / gcd(n, m)};
  }

  private int gcd(int numA, int numB) {
    if (numB == 0) return numA;

    return gcd(numB, numA % numB);
  }
}
