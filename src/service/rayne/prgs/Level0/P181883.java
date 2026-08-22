package service.rayne.prgs.Level0;

public class P181883 {
  public int[] solution(int[] arr, int[][] queries) {
    for (int[] query : queries) {
      for (int i = query[0]; i <= query[1]; i++) arr[i] += 1;
    }

    return arr;
  }
}
