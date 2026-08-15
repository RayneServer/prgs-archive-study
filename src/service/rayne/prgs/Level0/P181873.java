package service.rayne.prgs.Level0;

public class P181873 {
  public String solution(String my_string, String alp) {
    String[] strArr = my_string.split("");
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals(alp)) strArr[i] = strArr[i].toUpperCase();
    }

    return String.join("", strArr);
  }
}
