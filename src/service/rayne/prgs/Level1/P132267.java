package service.rayne.prgs.Level1;

public class P132267 {
  public int solution(int a, int b, int n) {
    int bottle = n;
    int count = 0;

    while (bottle >= a) {
      // 새 콜라 교환 후 계산
      int coke = (bottle / a) * b;
      bottle %= a;
      count += coke;

      // 교환한 콜라 마신 후 빈 병 추가
      bottle += coke;
    }

    return count;
  }
}
