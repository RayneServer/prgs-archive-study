package service.rayne.prgs.Level0;

public class P181834 {
  public String solution(String myString) {
    char[] strArr = myString.toCharArray();
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i] < 'l') strArr[i] = 'l';
    }

    return new String(strArr);
  }
}
