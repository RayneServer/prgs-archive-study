package service.rayne.prgs.Level0;

public class P181928 {
  public int solution(int[] num_list) {
    StringBuilder evenStr = new StringBuilder();
    StringBuilder oddStr = new StringBuilder();

    for (int i : num_list) {
      if (i % 2 == 0) evenStr.append(i);
      else oddStr.append(i);
    }

    return Integer.parseInt(evenStr.toString()) + Integer.parseInt(oddStr.toString());
  }
}
