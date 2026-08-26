package service.rayne.prgs.Level0;

public class P120842 {
  public int[][] solution(int[] num_list, int n) {
    int[][] answer = new int[num_list.length / n][n];

    int counter = 0;
    for (int i = 0; i < answer.length; i++) {
      for (int j = 0; j < answer[i].length; j++) {
        answer[i][j] = num_list[counter++];
      }
    }

    return answer;
  }
}
