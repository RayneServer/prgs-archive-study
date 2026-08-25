package service.rayne.prgs.Level0;

public class P181902 {
  public int[] solution(String my_string) {
    int[] result = new int[52];
    for (char c : my_string.toCharArray()) {
      if (c <= 'Z') result[c - 'A']++;
      else result[c - 'a' + 26]++;
    }

    return result;
  }
}
