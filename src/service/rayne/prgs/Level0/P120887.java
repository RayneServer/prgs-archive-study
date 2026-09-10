package service.rayne.prgs.Level0;

public class P120887 {
  public int solution(int i, int j, int k) {
    StringBuilder sb = new StringBuilder();

    for (int n = i; n <= j; n++) {
      sb.append(n);
    }

    String[] sbArr = sb.toString().split("");
    int count = 0;
    String strK = String.valueOf(k);

    for (String s : sbArr) {
      if (s.equals(strK)) count++;
    }

    return count;
  }
}
