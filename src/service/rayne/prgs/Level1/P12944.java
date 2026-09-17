package service.rayne.prgs.Level1;

public class P12944 {
  public double solution(int[] arr) {
    int sum = 0;
    for (int num : arr) sum += num;

    return sum / (double) arr.length;
  }
}
