package service.rayne.prgs.Level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class P12973 {
  public int solution(String s) {
    if (s.length() % 2 != 0) return 0;

    Deque<String> myStack = new ArrayDeque<>();

    for (String str : s.split("")) {
      if (!myStack.isEmpty() && myStack.peek().equals(str)) myStack.pop();
      else myStack.push(str);
    }

    if (!myStack.isEmpty()) return 0;
    return 1;
  }
}
