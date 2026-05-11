package service.rayne.prgs.Level0;

public class P120808 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int numer = (numer1 * denom2) + (numer2 * denom1);
    int denom = denom1 * denom2;

    // 유클리드 호제법
    int a = numer;
    int b = denom;
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }

    int[] answer = {numer / a, denom / a};
    return answer;
  }
}
