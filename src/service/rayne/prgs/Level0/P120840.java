package service.rayne.prgs.Level0;

public class P120840 {
  public static int solution(int balls, int share) {
    if (share > balls - share) share = balls - share;

    long result = 1;
    for (int i = 1; i <= share; i++) {
      result *= (balls - (i - 1));
      result /= i;
    }

    return (int) result;
  }
}
