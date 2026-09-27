package service.rayne.prgs.Level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class P12909 {
  boolean solution(String s) {
    Deque<String> myStack = new ArrayDeque<>();

    for (String str : s.split("")) {
      if (str.equals("(")) {
        myStack.push("쿠모린");
      } else {
        try {
          myStack.pop();
        } catch (Exception e) {
          return false;
        }
      }
    }

    if (myStack.isEmpty()) return true;
    return false;
  }
}
