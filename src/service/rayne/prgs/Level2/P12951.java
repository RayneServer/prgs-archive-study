package service.rayne.prgs.Level2;

public class P12951 {
  public String solution(String s) {
    String[] strArr = s.toLowerCase().split(" ", -1);

    for (int i = 0; i < strArr.length; i++) {
      String str = strArr[i];

      try {
        String firstStr = str.substring(0, 1).toUpperCase();
        strArr[i] = firstStr + str.substring(1);
      } catch (Exception e) {
        continue;
      }
    }

    return String.join(" ", strArr);
  }
}
