package service.rayne.prgs.Level0;

public class P181865 {
  public int solution(String binomial) {
    String[] binArr = binomial.split(" ");
    int numA = Integer.parseInt(binArr[0]);
    int numB = Integer.parseInt(binArr[2]);

    if ("+".equals(binArr[1])) return numA + numB;
    else if ("-".equals(binArr[1])) return numA - numB;
    else return numA * numB;
  }
}
