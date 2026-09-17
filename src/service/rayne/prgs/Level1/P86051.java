package service.rayne.prgs.Level1;

public class P86051 {
  public int solution(int[] numbers) {
    int result = 45;
    for (int num : numbers) result -= num;

    return result;
  }
}
