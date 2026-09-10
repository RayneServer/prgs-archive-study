package service.rayne.prgs.Level0;

public class P120862 {
  public int solution(int[] numbers) {
    int maxValue = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] * numbers[j] > maxValue) maxValue = numbers[i] * numbers[j];
      }
    }

    return maxValue;
  }
}
