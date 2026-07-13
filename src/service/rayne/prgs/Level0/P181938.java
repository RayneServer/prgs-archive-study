package service.rayne.prgs.Level0;

public class P181938 {
  public int solution(int a, int b) {
    int firstCal = Integer.parseInt("" + a + b);
    int secondCal = 2 * a * b;

    return Math.max(firstCal, secondCal);
  }
}
