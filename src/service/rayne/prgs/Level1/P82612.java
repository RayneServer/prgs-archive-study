package service.rayne.prgs.Level1;

public class P82612 {
  public long solution(int price, int money, int count) {
    long totalPrice = 0;
    for (int i = 1; i <= count; i++) {
      totalPrice += price * i;
    }

    long result = totalPrice - money;
    return result > 0 ? result : 0;
  }
}
