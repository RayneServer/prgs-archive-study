package service.rayne.prgs.Level1;

import java.util.HashSet;
import java.util.Set;

public class P1845 {
  public int solution(int[] nums) {
    int pokemons = nums.length / 2;

    Set<Integer> mySet = new HashSet<>();
    for (int num : nums) mySet.add(num);

    return Math.min(pokemons, mySet.size());
  }
}
