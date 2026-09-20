package service.rayne.prgs.Level1;

public class P12977 {
  public int solution(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (isPrime(nums[i] + nums[j] + nums[k])) count++;
        }
      }
    }

    return count;
  }

  private boolean isPrime(int num) {
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) return false;
    }

    return true;
  }
}
