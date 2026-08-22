package service.rayne.prgs.Level0;

public class P181855 {
  public int solution(String[] strArr) {
    int[] countArr = new int[31];
    for (String str : strArr) {
      countArr[str.length()]++;
    }

    int maxValue = 0;
    for (int i = 1; i < countArr.length; i++) {
      if (countArr[i] > maxValue) {
        maxValue = countArr[i];
      }
    }

    return maxValue;
  }
}
