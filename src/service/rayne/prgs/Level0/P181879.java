package service.rayne.prgs.Level0;

public class P181879 {
  public int solution(int[] num_list) {
    int result = 1;

    if (num_list.length > 10) {
      for (int i : num_list) result += i;
      return result - 1;
    } else {
      for (int i : num_list) result *= i;
      return result;
    }
  }
}
