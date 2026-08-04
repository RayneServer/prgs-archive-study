package service.rayne.prgs.Level0;

public class P181922 {
  public int[] solution(int[] arr, int[][] queries) {
    for (int[] query : queries) {
      for (int i = query[0]; i <= query[1]; i++) {
        if (i % query[2] == 0) arr[i]++;
      }
    }

    return arr;
  }
}
