package service.rayne.prgs.Level0;

public class P181908 {
  public int solution(String my_string, String is_suffix) {
    if (is_suffix.length() > my_string.length()) return 0;

    String myStringSuffix = my_string.substring(my_string.length() - is_suffix.length());

    return myStringSuffix.equals(is_suffix) ? 1 : 0;
  }
}
