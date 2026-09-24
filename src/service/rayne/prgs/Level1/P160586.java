package service.rayne.prgs.Level1;

public class P160586 {
  public int[] solution(String[] keymap, String[] targets) {
    int[] result = new int[targets.length];
    Base:
    for (int i = 0; i < targets.length; i++) {
      String target = targets[i];
      int count = 0;

      Master:
      for (char c : target.toCharArray()) {
        int idx = 0;

        while (idx < 100) {
          for (String key : keymap) {
            if (key.length() <= idx) continue;

            if (key.charAt(idx) == c) {
              count += idx + 1;
              continue Master;
            }
          }

          idx++;
        }

        result[i] = -1;
        continue Base;
      }

      result[i] = count;
    }

    return result;
  }
}
