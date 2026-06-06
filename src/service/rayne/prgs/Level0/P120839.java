package service.rayne.prgs.Level0;

public class P120839 {
  public String solution(String rsp) {
    String[] rspArr = rsp.split("");

    for (int i = 0; i < rspArr.length; i++) {
      char c = rspArr[i].charAt(0);

      if (c == '2') rspArr[i] = "0";
      else if (c == '0') rspArr[i] = "5";
      else rspArr[i] = "2";
    }

    return String.join("", rspArr);
  }
}
