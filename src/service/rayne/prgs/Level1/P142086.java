package service.rayne.prgs.Level1;

public class P142086 {
  public int[] solution(String s) {
    int[] alpArr = new int[26];
    int[] resultArr = new int[s.length()];

    for (int i = 0; i < alpArr.length; i++) alpArr[i] = -1;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (alpArr[c - 'a'] == -1) {
        resultArr[i] = -1;
        alpArr[c - 'a'] = i;
      } else {
        resultArr[i] = i - (alpArr[c - 'a']);
        alpArr[c - 'a'] = i;
      }
    }

    return resultArr;
  }
}
