package service.rayne.prgs.Level1;

public class P77884 {
  public int solution(int left, int right) {
    int result = 0;
    for (int i = left; i <= right; i++) {
      if (isPow(i)) result -= i;
      else result += i;
    }

    return result;
  }

  private boolean isPow(int num) {
    for (int i = 1; i * i <= num; i++) {
      if (i * i == num) return true;
    }

    return false;
  }
}
