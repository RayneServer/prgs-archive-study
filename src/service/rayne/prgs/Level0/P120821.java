package service.rayne.prgs.Level0;

public class P120821 {
  public int[] solution(int[] num_list) {
    int[] result = new int[num_list.length];

    for (int i = 0; i < num_list.length; i++) {
      result[num_list.length - 1 - i] = num_list[i];
    }

    return result;
  }
}
