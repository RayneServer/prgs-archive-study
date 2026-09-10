package service.rayne.prgs.Level0;

public class P120871 {
  public int solution(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result++;
      while (result % 3 == 0 || isThree(result)) result++;
    }

    return result;
  }

  private boolean isThree(int num) {
    String[] arr = String.valueOf(num).split("");
    for (String s : arr) {
      if (s.equals("3")) return true;
    }

    return false;
  }
}
