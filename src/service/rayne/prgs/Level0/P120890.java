package service.rayne.prgs.Level0;

public class P120890 {
  public int solution(int[] array, int n) {
    int gap = 101;
    int result = 101;
    for (int num : array) {
      if (Math.abs(n - num) < gap) {
        gap = Math.abs(n - num);
        result = num;
      } else if (Math.abs(n - num) == gap) {
        result = Math.min(num, result);
      }
    }

    return result;
  }
}
