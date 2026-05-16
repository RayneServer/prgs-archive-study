package service.rayne.prgs.Level0;

public class P120818 {
  public int solution(int price) {
    double discount = price >= 500000 ? 0.8 : price >= 300000 ? 0.9 : price >= 100000 ? 0.95 : 1;
    return (int) (price * discount);
  }
}
