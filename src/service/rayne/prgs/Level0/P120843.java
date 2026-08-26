package service.rayne.prgs.Level0;

public class P120843 {
  public int solution(int[] numbers, int k) {
    return numbers[((k - 1) * 2) % numbers.length];
  }
}
