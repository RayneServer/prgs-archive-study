package service.rayne.prgs.Level0;

public class P181884 {
  public int solution(int[] numbers, int n) {
    int result = 0;
    for (int number : numbers) {
      if (result > n) break;
      
      result += number;
    }

    return result;
  }
}
