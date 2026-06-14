package service.rayne.prgs.Level0;

public class P181850 {
  public int solution(double flo) {
    String s = String.valueOf(flo);
    int idx = s.indexOf(".");

    return Integer.parseInt(s.substring(0, idx));
  }
}
