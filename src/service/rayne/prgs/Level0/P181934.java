package service.rayne.prgs.Level0;

public class P181934 {
  public int solution(String ineq, String eq, int n, int m) {
    if (n == m && eq.equals("!")) return 0;
    if (n < m && ineq.equals(">")) return 0;
    if (n > m && ineq.equals("<")) return 0;

    return 1;
  }
}
