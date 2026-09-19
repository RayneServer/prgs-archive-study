package service.rayne.prgs.Level1;

public class P136798 {
  public int solution(int number, int limit, int power) {
    int result = 0;
    for (int i = 1; i <= number; i++) {
      int atk = calc(i);
      if (atk > limit) atk = power;

      result += atk;
    }

    return result;
  }

  // 약수 구하는 메서드
  private int calc(int num) {
    if (num == 1) return 1;

    int count = 0;

    int i;
    for (i = 1; i * i < num; i++) {
      if (num % i == 0) count += 2;
    }

    if (i * i == num) count++;
    return count;
  }
}
