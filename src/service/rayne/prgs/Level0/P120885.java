package service.rayne.prgs.Level0;

public class P120885 {
  public String solution(String bin1, String bin2) {
    int numA = Integer.valueOf(bin1, 2);
    int numB = Integer.valueOf(bin2, 2);

    return Integer.toBinaryString(numA + numB);
  }
}
