package service.rayne.prgs.Level0;

public class P120893 {
  public String solution(String my_string) {
    char[] charArr = my_string.toCharArray();
    for (int i = 0; i < charArr.length; i++) {
      char c = charArr[i];

      if (c <= 'Z') {
        charArr[i] = (char) (c - 'A' + 'a');
      } else {
        charArr[i] = (char) (c - 'a' + 'A');
      }
    }

    return new String(charArr);
  }
}
