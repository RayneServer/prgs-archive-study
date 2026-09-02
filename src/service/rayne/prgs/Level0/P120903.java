package service.rayne.prgs.Level0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P120903 {
  public int solution(String[] s1, String[] s2) {
    Set<String> s1Set = new HashSet(List.of(s1));
    Set<String> s2Set = new HashSet(List.of(s2));

    s1Set.retainAll(s2Set);
    return s1Set.size();
  }
}
