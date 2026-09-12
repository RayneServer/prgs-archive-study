package service.rayne.prgs.Level0;

public class P120863 {
  public String solution(String polynomial) {
    String[] polyArr = polynomial.split(" ");
    int numX = 0;
    int numC = 0;

    for (String str : polyArr) {
      if (str.equals("+")) continue;

      if (str.endsWith("x")) {
        if (str.equals("x")) numX++;
        else numX += Integer.parseInt(str.substring(0, str.length() - 1));
      } else {
        numC += Integer.parseInt(str);
      }
    }

    String x = numX == 1 ? "x" : numX + "x";

    if (numX == 0) return "" + numC;
    if (numC == 0) return x;

    return String.format("%s + %s", x, numC);
  }
}
