package service.rayne.prgs.Level0;

public class P181864 {
  public int solution(String myString, String pat) {
    char[] patArr = pat.toCharArray();
    for (int i = 0; i < patArr.length; i++) {
      if (patArr[i] == 'A') patArr[i] = (char) (patArr[i] + 1);
      else patArr[i] = (char) (patArr[i] - 1);
    }

    pat = String.valueOf(patArr);
    return myString.contains(pat) ? 1 : 0;
  }
}
