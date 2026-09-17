package service.rayne.prgs.Level1;

public class P12919 {
  public String solution(String[] seoul) {
    int location = -1;
    for (int i = 0; i < seoul.length; i++) {
      if ("Kim".equals(seoul[i])) location = i;
    }

    return String.format("김서방은 %s에 있다", location);
  }
}
