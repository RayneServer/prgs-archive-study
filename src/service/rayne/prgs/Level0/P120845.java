package service.rayne.prgs.Level0;

public class P120845 {
  public int solution(int[] box, int n) {
    for (int i = 0; i < box.length; i++) {
      box[i] = box[i] / n;
    }

    return (box[0] * box[1] * box[2]);
  }
}
