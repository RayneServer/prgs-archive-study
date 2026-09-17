package service.rayne.prgs.Level1;

public class P12928 {
  public int solution(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int answer = n + 1;
    int i;
    for (i = 2; i * i < n; i++) {
      if (n % i == 0) {
        answer += i + (n / i);
      }
    }

    if (i * i == n) answer += i;
    return answer;
  }
}
