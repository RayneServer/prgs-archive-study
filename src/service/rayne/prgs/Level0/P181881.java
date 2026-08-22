package service.rayne.prgs.Level0;

public class P181881 {
  public int solution(int[] arr) {
    int count = 0;
    while (true) {
      boolean isChange = false;

      for (int i = 0; i < arr.length; i++) {
        int num = arr[i];

        if (num >= 50 && num % 2 == 0) {
          arr[i] = num / 2;
          isChange = true;
        } else if (num < 50 && num % 2 == 1) {
          arr[i] = (num * 2) + 1;
          isChange = true;
        }
      }

      if (isChange) count++;
      else break;
    }

    return count;
  }
}
