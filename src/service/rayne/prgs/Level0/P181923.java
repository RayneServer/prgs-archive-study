package service.rayne.prgs.Level0;

public class P181923 {
  public int[] solution(int[] arr, int[][] queries) {
    int[] result = new int[queries.length];
    int pointer = 0;
    
    for (int[] query : queries) {
      int num = 1000000;

      for (int i = query[0]; i <= query[1]; i++) {
        if (arr[i] > query[2] && arr[i] < num) num = arr[i];
      }

      result[pointer++] = num == 1000000 ? -1 : num;
    }

    return result;
  }
}
