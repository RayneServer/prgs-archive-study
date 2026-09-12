package service.rayne.prgs.Level0;

public class P120924 {
  public int solution(int[] common) {
    boolean isPlus = (common[2] - common[1]) == (common[1] - common[0]);

    if (isPlus) return common[common.length - 1] + (common[1] - common[0]);
    else return common[common.length - 1] * (common[1] / common[0]);
  }
}
