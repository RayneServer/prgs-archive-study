package service.rayne.prgs.Level0;

public class P181905 {
  public String solution(String my_string, int s, int e) {
    String str1 = my_string.substring(0, s);
    String str2 = my_string.substring(s, e + 1);
    String str3 = my_string.substring(e + 1);

    str2 = new StringBuilder(str2).reverse().toString();
    StringBuilder sb = new StringBuilder();
    sb.append(str1);
    sb.append(str2);
    sb.append(str3);

    return sb.toString();
  }
}
