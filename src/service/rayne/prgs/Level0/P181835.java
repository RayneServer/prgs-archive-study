package service.rayne.prgs.Level0;

public class P181835 {
  public int[] solution(int[] arr, int k) {
    if (k % 2 == 0) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] += k;
      }
    } else {
      for (int i = 0; i < arr.length; i++) {
        arr[i] *= k;
      }
    }

    return arr;
  }
}
