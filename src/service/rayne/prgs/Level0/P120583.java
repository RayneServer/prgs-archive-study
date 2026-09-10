package service.rayne.prgs.Level0;

public class P120583 {
  public int solution(int[] array, int n) {
    int count = 0;
    for (int num : array) {
      if (num == n) count++;
    }

    return count;
  }
}
