package service.rayne.prgs.Level1;

public class P12930 {
  public String solution(String s) {
    String[] strArr = s.split("");

    int idxCount = 0;
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals(" ")) {
        idxCount = 0;
        continue;
      }

      if (idxCount % 2 == 0) {
        strArr[i] = strArr[i].toUpperCase();
        idxCount++;
      } else {
        strArr[i] = strArr[i].toLowerCase();
        idxCount++;
      }
    }

    return String.join("", strArr);
  }
}
