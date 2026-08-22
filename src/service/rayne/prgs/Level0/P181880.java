package service.rayne.prgs.Level0;

public class P181880 {
  public int solution(int[] num_list) {
    int count = 0;

    for (int num : num_list) {
      if (num == 1) continue;

      while (num > 1) {
        if (num % 2 == 0) {
          num /= 2;
          count++;
        } else {
          num = (num - 1) / 2;
          count++;
        }
      }
    }

    return count;
  }
}
