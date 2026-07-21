package service.rayne.prgs.Level0;

public class P181942 {
  public String solution(String str1, String str2) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str1.length(); i++) {
      stringBuilder.append(str1.charAt(i));
      stringBuilder.append(str2.charAt(i));
    }

    return stringBuilder.toString();
  }
}
