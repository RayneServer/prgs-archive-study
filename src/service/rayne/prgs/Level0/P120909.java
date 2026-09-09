package service.rayne.prgs.Level0;

public class P120909 {
  public int solution(int n) {
    double num = Math.sqrt(n);
    double numInt = (double) ((int) num);

    return num == numInt ? 1 : 2;
  }
}
