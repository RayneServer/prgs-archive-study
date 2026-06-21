package service.rayne.prgs.Level0;

public class P181840 {
  public int solution(int[] num_list, int n) {
    boolean isExist = false;

    for (int num : num_list) {
      if (num == n) isExist = true;
    }

    return isExist ? 1 : 0;
  }
}
