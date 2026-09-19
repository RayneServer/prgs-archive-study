package service.rayne.prgs.Level1;

public class P133499 {
  public int solution(String[] babbling) {
    int count = 0;
    for (String str : babbling) {
      str = str.replaceAll("aya", "1")
        .replaceAll("ye", "2")
        .replaceAll("woo", "3")
        .replaceAll("ma", "4");

      if (str.contains("11")) continue;
      if (str.contains("22")) continue;
      if (str.contains("33")) continue;
      if (str.contains("44")) continue;

      try {
        int num = Integer.parseInt(str);
        count++;
      } catch (Exception e) {
        continue;
      }
    }

    return count;
  }
}
