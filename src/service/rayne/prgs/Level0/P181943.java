package service.rayne.prgs.Level0;

public class P181943 {
  public String solution(String my_string, String overwrite_string, int s) {
    String[] myStringArr = my_string.split("");
    String[] overStringArr = overwrite_string.split("");
    for (int i = 0; i < overStringArr.length; i++) {
      myStringArr[i + s] = overStringArr[i];
    }

    return String.join("", myStringArr);
  }
}
