package service.rayne.prgs.Level0;

public class P120906 {
  public int solution(int n) {
    int result = 0;

    while (n > 0) {
      result += n % 10;
      n /= 10;
    }

    return result;
  }
}
