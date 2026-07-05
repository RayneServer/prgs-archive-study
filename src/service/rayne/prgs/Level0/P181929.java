package service.rayne.prgs.Level0;

public class P181929 {
  public int solution(int[] num_list) {
    long multiAll = 1;
    long sumAll = 0;

    for (int i : num_list) {
      multiAll *= i;
      sumAll += i;
    }

    return ((sumAll * sumAll) > multiAll) ? 1 : 0;
  }
}
