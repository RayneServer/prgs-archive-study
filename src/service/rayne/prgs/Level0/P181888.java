package service.rayne.prgs.Level0;

public class P181888 {
  public int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length % n != 0 ? (num_list.length / n) + 1 : (num_list.length / n)];
    for (int i = 0; i < num_list.length; i += n) {
      answer[i / n] = num_list[i];
    }

    return answer;
  }
}
