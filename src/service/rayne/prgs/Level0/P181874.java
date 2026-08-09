package service.rayne.prgs.Level0;

public class P181874 {
  public String solution(String myString) {
    char[] str = myString.toLowerCase().toCharArray();
    for (int i = 0; i < str.length; i++) {
      if (str[i] == 'a') str[i] = 'A';
    }

    return new String(str);
  }
}
