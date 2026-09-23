package service.rayne.prgs.Level1;

public class P140108 {
  public int solution(String s) {
    int count = 0;

    Master:
    while (s.length() > 0) {
      char word = s.charAt(0);
      int wordCount = 0;
      int notWordCount = 0;

      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (word == c) wordCount++;
        else notWordCount++;

        if (wordCount == notWordCount) {
          count++;
          s = s.substring(i + 1);
          continue Master;
        }
      }

      count++;
      s = "";
    }

    return count;
  }
}
