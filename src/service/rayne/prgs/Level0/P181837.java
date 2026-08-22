package service.rayne.prgs.Level0;

public class P181837 {
  public int solution(String[] order) {
    int result = 0;
    for (String str : order) {
      if (str.contains("cafelatte")) result += 5000;
      else result += 4500;
    }

    return result;
  }
}
