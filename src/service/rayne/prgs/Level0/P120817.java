package service.rayne.prgs.Level0;

public class P120817 {
  public double solution(int[] numbers) {
    double result = 0;
    for (int number : numbers) result += number;

    return result / numbers.length;
  }
}
