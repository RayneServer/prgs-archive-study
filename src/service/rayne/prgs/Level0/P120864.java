package service.rayne.prgs.Level0;

public class P120864 {
  public int solution(String my_string) {
    int result = 0;

    StringBuilder sb = new StringBuilder();
    for (char c : my_string.toCharArray()) {
      if (c >= '0' && c <= '9') {
        sb.append(c);
        continue;
      }

      if (sb.isEmpty()) continue;

      result += Integer.parseInt(sb.toString());
      sb = new StringBuilder();
    }

    if (!sb.isEmpty()) result += Integer.parseInt(sb.toString());

    return result;
  }
}
