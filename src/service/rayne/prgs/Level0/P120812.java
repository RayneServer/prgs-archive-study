package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120812 {
  public int solution(int[] array) {
    int[] numArr = new int[1001];
    for (int num : array) {
      numArr[num]++;
    }

    int max = -1;
    int maxIndex = -1;
    for (int i = 1; i <= 1000; i++) {
      if (numArr[i] > max) {
        max = numArr[i];
        maxIndex = i;
      }
    }

    Arrays.sort(numArr);
    if (array.length == 0 || numArr[999] == numArr[1000]) return -1;
    else return maxIndex;
  }
}
