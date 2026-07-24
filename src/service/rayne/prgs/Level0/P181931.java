package service.rayne.prgs.Level0;

public class P181931 {
  public int solution(int a, int d, boolean[] included) {
    int num = 0;
    for (boolean b : included) {
      if (b) num += a;
      a += d;
    }

    return num;
  }
}
