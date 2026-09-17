package service.rayne.prgs.Level1;

public class P87389 {
  public int solution(int n) {
    int answer = 2;

    while (answer < n) {
      if (n % answer == 1) return answer;
      answer++;
    }

    return -1;
  }
}
