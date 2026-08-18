package service.rayne.prgs.Level0;

import java.util.*;

public class P181916 {
  public int solution(int a, int b, int c, int d) {
    Integer[] diceArr = {a, b, c, d};
    List<Integer> diceList = new ArrayList<>(List.of(diceArr));
    Set<Integer> diceSet = new HashSet<>(diceList);

    switch (diceSet.size()) {
      case 1 -> {
        return 1111 * diceList.getFirst();
      }

      case 2 -> {
        diceList.sort(Comparator.naturalOrder());
        if (Objects.equals(diceList.get(1), diceList.get(2))) {
          int result = Objects.equals(diceList.get(0), diceList.get(1)) ?
            10 * diceList.get(0) + diceList.get(3) : 10 * diceList.get(3) + diceList.get(0);
          return result * result;
        } else return (diceList.getLast() + diceList.getFirst()) * (diceList.getLast() - diceList.getFirst());
      }

      case 3 -> {
        for (Integer i : diceSet) diceList.remove(i);
        Integer target = diceList.getFirst();

        diceSet.remove(target);
        int result = 1;
        for (Integer i : diceSet) result *= i;
        return result;
      }

      case 4 -> {
        return Collections.min(diceList);
      }
    }

    return -1;
  }
}
