package service.rayne.prgs.Level0;

public class P120875 {
  public int solution(int[][] dots) {
    if ((calc(dots[0][0], dots[1][0]) * calc(dots[2][1], dots[3][1])) == (calc(dots[2][0], dots[3][0]) * calc(dots[0][1], dots[1][1]))) return 1;

    if ((calc(dots[0][0], dots[2][0]) * calc(dots[1][1], dots[3][1])) == (calc(dots[1][0], dots[3][0]) * calc(dots[0][1], dots[2][1]))) return 1;

    if ((calc(dots[0][0], dots[3][0]) * calc(dots[2][1], dots[1][1])) == (calc(dots[2][0], dots[1][0]) * calc(dots[0][1], dots[3][1]))) return 1;

    return 0;
  }

  private int calc(int numA, int numB) {
    return Math.max(numA, numB) - Math.min(numA, numB);
  }
}
