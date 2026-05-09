package service.rayne.prgs.Level0;

public class P120813 {
  public int[] solution(int n) {
    int[] answer = new int[n % 2 == 1 ? (n + 1) / 2 : n / 2];
    int count = 0;
    for (int i = 1; i <= n; i += 2) {
      answer[count++] = i;
    }

    return answer;
  }
}
