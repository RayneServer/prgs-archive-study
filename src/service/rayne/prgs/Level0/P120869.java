package service.rayne.prgs.Level0;

import java.util.Arrays;

public class P120869 {
  public int solution(String[] spell, String[] dic) {
    Arrays.sort(spell);
    String spellStr = String.join("", spell);

    for (int i = 0; i < dic.length; i++) {
      String[] strArr = dic[i].split("");
      Arrays.sort(strArr);
      dic[i] = String.join("", strArr);
    }

    for (String s : dic) {
      if (s.equals(spellStr)) return 1;
    }

    return 2;
  }
}
