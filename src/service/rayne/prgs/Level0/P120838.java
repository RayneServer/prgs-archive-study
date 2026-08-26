package service.rayne.prgs.Level0;

import java.util.HashMap;
import java.util.Map;

public class P120838 {
  public String solution(String letter) {
    Map<String, String> letterMap = new HashMap<>();
    letterMap.put(".-", "a");
    letterMap.put("-...", "b");
    letterMap.put("-.-.", "c");
    letterMap.put("-..", "d");
    letterMap.put(".", "e");
    letterMap.put("..-.", "f");
    letterMap.put("--.", "g");
    letterMap.put("....", "h");
    letterMap.put("..", "i");
    letterMap.put(".---", "j");
    letterMap.put("-.-", "k");
    letterMap.put(".-..", "l");
    letterMap.put("--", "m");
    letterMap.put("-.", "n");
    letterMap.put("---", "o");
    letterMap.put(".--.", "p");
    letterMap.put("--.-", "q");
    letterMap.put(".-.", "r");
    letterMap.put("...", "s");
    letterMap.put("-", "t");
    letterMap.put("..-", "u");
    letterMap.put("...-", "v");
    letterMap.put(".--", "w");
    letterMap.put("-..-", "x");
    letterMap.put("-.--", "y");
    letterMap.put("--..", "z");

    String[] letterArr = letter.split(" ");
    for (int i = 0; i < letterArr.length; i++) {
      letterArr[i] = letterMap.get(letterArr[i]);
    }

    return String.join("", letterArr);
  }
}
