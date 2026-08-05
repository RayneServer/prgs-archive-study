package service.rayne.prgs.Level0;

import java.util.ArrayList;
import java.util.List;

public class P181921 {
  public int[] solution(int l, int r) {
    List<Integer> numList = new ArrayList<>();
    findNum(numList, "5", l, r);

    int[] result = numList.stream().sorted().mapToInt(Integer::intValue).toArray();
    return result.length != 0 ? result : new int[]{-1};
  }

  private static void findNum(List<Integer> numList, String num, int minNum, int maxNum) {
    Integer thisNum = Integer.valueOf(num);
    if (thisNum.compareTo(maxNum) > 0) return;

    for (char c : num.toCharArray()) {
      if (c != '5' && c != '0') return;
    }

    if (thisNum.compareTo(minNum) >= 0) numList.add(thisNum);

    findNum(numList, num + "0", minNum, maxNum);
    findNum(numList, num + "5", minNum, maxNum);
  }
}
