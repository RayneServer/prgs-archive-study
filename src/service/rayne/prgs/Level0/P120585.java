package service.rayne.prgs.Level0;

public class P120585 {
  public int solution(int[] array, int height) {
    int count = 0;
    for (int num : array) {
      if (num > height) count++;
    }

    return count;
  }
}
