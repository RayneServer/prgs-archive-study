package service.rayne.prgs.Level1;

public class P12916 {
  boolean solution(String s) {
    String[] strArr = s.toLowerCase().split("");

    int countP = 0;
    int countY = 0;
    for (String str : strArr) {
      if ("p".equals(str)) countP++;
      if ("y".equals(str)) countY++;
    }

    return countP == countY;
  }
}
