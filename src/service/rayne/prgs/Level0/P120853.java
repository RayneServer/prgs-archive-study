package service.rayne.prgs.Level0;

public class P120853 {
  public int solution(String s) {
    String[] strArr = s.split(" ");
    int result = 0;

    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals("Z")) {
        int num = Integer.parseInt(strArr[i - 1]);
        result -= num;
      } else {
        int num = Integer.parseInt(strArr[i]);
        result += num;
      }
    }

    return result;
  }
}
