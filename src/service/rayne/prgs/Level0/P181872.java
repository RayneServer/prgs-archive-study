package service.rayne.prgs.Level0;

public class P181872 {
  public String solution(String myString, String pat) {
    int targetIndex = 0;
    for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
      String str = myString.substring(i, i + pat.length());
      if (str.equals(pat)) targetIndex = i;
    }

    return myString.substring(0, targetIndex + pat.length());
  }
}
