package service.rayne.prgs.Level1;

public class P12943 {
  public int solution(int num) {
    if (num == 1) return 0;

    int count = 0;
    long number = num;
    while (number > 1) {
      if (number % 2 == 0) number /= 2;
      else number = (number * 3) + 1;

      count++;
      if (count >= 500) return -1;
    }

    return count;
  }
}
