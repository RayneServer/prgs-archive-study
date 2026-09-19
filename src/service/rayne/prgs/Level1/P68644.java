package service.rayne.prgs.Level1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class P68644 {
  public int[] solution(int[] numbers) {
    Set<Integer> mySet = new HashSet<>();

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        mySet.add(numbers[i] + numbers[j]);
      }
    }

    return mySet.stream().sorted(Comparator .naturalOrder()).mapToInt(Integer::intValue).toArray();
  }
}
