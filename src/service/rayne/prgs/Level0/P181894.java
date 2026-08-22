package service.rayne.prgs.Level0;

public class P181894 {
  public int[] solution(int[] arr) {
    int firstIdx = -1;
    int lastIdx = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        if (firstIdx < 0) firstIdx = i;
        lastIdx = i;
      }
    }

    if (firstIdx < 0) return new int[]{-1};

    int[] result = new int[lastIdx - firstIdx + 1];
    for (int i = firstIdx; i <= lastIdx; i++) {
      result[i - firstIdx] = arr[i];
    }

    return result;
  }
}
