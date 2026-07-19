package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P181856 {
  public int solution(int[] arr1, int[] arr2) {
    if (arr1.length > arr2.length) return 1;
    else if (arr2.length > arr1.length) return -1;
    else {
      int sumArr1 = Arrays.stream(arr1).sum();
      int sumArr2 = Arrays.stream(arr2).sum();

      return Integer.compare(sumArr1, sumArr2);
    }
  }
}
