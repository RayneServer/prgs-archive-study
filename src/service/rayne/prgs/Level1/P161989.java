package service.rayne.prgs.Level1;

public class P161989 {
  public int solution(int n, int m, int[] section) {
    int[] wall = new int[n];
    for (int num : section) wall[num - 1] = 1;

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (wall[i] == 1) {
        for (int j = i; j < i + m; j++) {
          try {
            wall[j] = 0;
          } catch (Exception e) {
            break;
          }
        }
        count++;
      }
    }

    return count;
  }
}
