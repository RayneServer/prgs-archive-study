package service.rayne.prgs.Level0;

public class P181857 {
  public int[] solution(int[] arr) {
    int arrLength = arr.length;
    int targetLength = 1;
    while (targetLength < arrLength) targetLength *= 2;

    int[] result = new int[targetLength];
    for (int i = 0; i < arrLength; i++) {
      result[i] = arr[i];
    }

    return result;
  }
}
