package service.rayne.prgs.Level1;

public class P147355 {
  public int solution(String t, String p) {
    long numP = Long.parseLong(p);
    int count = 0;
    for (int i = 0; i < t.length(); i++) {
      long numT;
      try {
        numT = Long.parseLong(t.substring(i, i + p.length()));
      } catch (Exception e) {
        break;
      }

      if (numP >= numT) count++;
    }

    return count;
  }
}
