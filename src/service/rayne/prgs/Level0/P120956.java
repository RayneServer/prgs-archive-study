package service.rayne.prgs.Level0;

public class P120956 {
  public int solution(String[] babbling) {
    int count = 0;

    for (String str : babbling) {
      str = str.replace("aya", "1");
      str = str.replace("ye", "1");
      str = str.replace("woo", "1");
      str = str.replace("ma", "1");

      str = str.replace("1", "");
      if (str.length() == 0) count++;
    }

    return count;
  }
}
