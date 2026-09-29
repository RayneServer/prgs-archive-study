package service.rayne.prgs.Level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P12941 {
  public int solution(int[] arrA, int[] arrB) {
    List<Integer> listA = new ArrayList<>();
    List<Integer> listB = new ArrayList<>();

    for (int num : arrA) listA.add(num);
    for (int num : arrB) listB.add(num);

    // 남은 수 중 가장 큰 수와 가장 작은 수를 매칭시키면 반드시 최솟값이 나온다.
    listA.sort(Comparator.naturalOrder());
    listB.sort(Comparator.reverseOrder());

    int result = 0;
    for (int i = 0; i < arrA.length; i++) {
      result += (listA.get(i) * listB.get(i));
    }

    return result;
  }
}
