package service.rayne.prgs.Level0;

public class P181841 {
  public String solution(String[] str_list, String ex) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String s : str_list) {
      if (!s.contains(ex)) stringBuilder.append(s);
    }

    return stringBuilder.toString();
  }
}
