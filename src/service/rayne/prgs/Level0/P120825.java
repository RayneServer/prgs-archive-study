package service.rayne.prgs.Level0;

public class P120825 {
  public String solution(String my_string, int n) {
    String[] strArr = my_string.split("");
    for (int i = 0; i < strArr.length; i++) {
      strArr[i] = strArr[i].repeat(n);
    }

    return String.join("", strArr);
  }
}
