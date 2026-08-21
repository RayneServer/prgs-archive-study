package service.rayne.prgs.Level0;

public class P181911 {
  public String solution(String[] my_strings, int[][] parts) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < my_strings.length; i++) {
      String subStr = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
      sb.append(subStr);
    }

    return sb.toString();
  }
}
