package service.rayne.prgs.Level0;

public class P181924 {
  public int[] solution(int[] arr, int[][] queries) {
    for (int[] query : queries) {
      int temp = arr[query[0]];
      arr[query[0]] = arr[query[1]];
      arr[query[1]] = temp;
    }

    return arr;
  }
}
