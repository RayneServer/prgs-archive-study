package service.rayne.prgs.Level0;

public class P181900 {
  public String solution(String my_string, int[] indices) {
    char[] strArr = my_string.toCharArray();
    for (int idx : indices) {
      strArr[idx] = '0';
    }

    String result = new String(strArr);
    return result.replaceAll("0", "");
  }
}
