package service.rayne.prgs.Level0;

public class P181903 {
  public String solution(int q, int r, String code) {
    StringBuilder sb = new StringBuilder();
    String[] codeSplit = code.split("");

    for (int i = 0; i < codeSplit.length; i++) {
      if (i % q == r) sb.append(codeSplit[i]);
    }

    return sb.toString();
  }
}
